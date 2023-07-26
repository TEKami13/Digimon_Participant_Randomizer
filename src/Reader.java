import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

@SuppressWarnings("SpellCheckingInspection")
public class Reader {


    @SuppressWarnings("SpellCheckingInspection")
    public ArrayList<Participant> participantObtainer() {

        ArrayList<Participant> participant = new ArrayList<>();

        int counter = 0;

        Participant p1 = new Participant();

        String txt;

        try {

            File participants = new File("Participants.txt");

            Scanner registerP = new Scanner(participants);

            while (registerP.hasNextLine()) {
                String data = registerP.nextLine();
                counter++;
                if (counter == 1) {
                    txt = data;
                    p1.setPId(parseInt(txt));
                } else if (counter == 2) {
                    txt = data;
                    p1.setPName(txt);
                } else {
                    txt = data;
                    p1.setPNemesis(txt);
                    participant.add(p1);
                    counter = 0;
                    registerP.nextLine();
                    p1 = new Participant();
                }
            }
            registerP.close();
        } catch (FileNotFoundException e) {
            System.out.println("File has not been found.");
            e.printStackTrace();
        }

        return participant;
    }
}
