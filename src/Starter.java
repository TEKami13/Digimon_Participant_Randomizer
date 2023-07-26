import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("EnhancedSwitchMigration")
public class Starter {

    Reader r1 = new Reader();

    @SuppressWarnings("NonAsciiCharacters")
    public void makeGroups() {

        ArrayList<Participant> everyone = r1.participantObtainer();

        int groupCount = 4;
        int maxSize = everyone.size() / groupCount;
        int mRand;
        int counter = 0;

        boolean filledUp;
        boolean addedParticipant;
        boolean nemesisMax1;
        boolean nemesisMax2;
        boolean nemesisMax3;
        boolean nemesisMax4;

        int まじであんたはグーグルトランスレーターが使った = 0;
        int wwww冗談だ = 0;

        Collections.shuffle(everyone);

        ArrayList<Participant> g1 = new ArrayList<>();
        ArrayList<Participant> g2 = new ArrayList<>();
        ArrayList<Participant> g3 = new ArrayList<>();
        ArrayList<Participant> g4 = new ArrayList<>();

        while (g1.size() != maxSize || g2.size() != maxSize || g3.size() != maxSize || g4.size() != maxSize) {
            addedParticipant = false;
            nemesisMax1 = false;
            nemesisMax2 = false;
            nemesisMax3 = false;
            nemesisMax4 = false;

            while (!addedParticipant) {

                まじであんたはグーグルトランスレーターが使った++;

                if (まじであんたはグーグルトランスレーターが使った == 9999) {
                    wwww冗談だ++;
                    g1.clear();
                    g2.clear();
                    g3.clear();
                    g4.clear();
                    まじであんたはグーグルトランスレーターが使った = 0;
                }

                if (wwww冗談だ == 999) {
                    System.out.println("Something went wrong, I can feel it.");
                    return;
                }

                mRand = (int)(Math.random() * groupCount) + 1;
                filledUp = false;


                switch (mRand) {
                    case 1 : {
                        if (g1.size() == maxSize) {
                            filledUp = true;
                        }
                        break;
                    }
                    case 2 : {
                        if (g2.size() == maxSize) {
                            filledUp = true;
                        }
                        break;
                    }
                    case 3 : {
                        if (g3.size() == maxSize) {
                            filledUp = true;
                        }
                        break;
                    }
                    case 4 : {
                        if (g4.size() == maxSize) {
                            filledUp = true;
                        }
                        break;
                    }
                }
                if (!filledUp) {
                    if (!nemesisChecker(g1, g2, g3, g4, mRand, everyone.get(counter))) {
                        switch (mRand) {
                            case 1 : {
                                g1.add(everyone.get(counter));
                                addedParticipant = true;
                                break;
                            }
                            case 2 : {
                                g2.add(everyone.get(counter));
                                addedParticipant = true;
                                break;
                            }
                            case 3 : {
                                g3.add(everyone.get(counter));
                                addedParticipant = true;
                                break;
                            }
                            case 4 : {
                                g4.add(everyone.get(counter));
                                addedParticipant = true;
                                break;
                            }
                        }
                        counter++;
                    } else {
                        switch (mRand) {
                            case 1 : {
                                nemesisMax1 = true;
                                break;
                            }
                            case 2 : {
                                nemesisMax2 = true;
                                break;
                            }
                            case 3 : {
                                nemesisMax3 = true;
                                break;
                            }
                            case 4 : {
                                nemesisMax4 = true;
                                break;
                            }
                        }
                    }
                }
                if (nemesisMax1 && nemesisMax2 && nemesisMax3 && nemesisMax4) {
                    wwww冗談だ++;
                    g1.clear();
                    g2.clear();
                    g3.clear();
                    g4.clear();
                    まじであんたはグーグルトランスレーターが使った = 0;
                }
            }
        }

        try {
            File fairu = new File("Participant_Grouping.txt");
            fairu.createNewFile();
        } catch (IOException machine) {
            System.out.println("Something weird is wrong, I can feel it..");
            machine.printStackTrace();
        }

        try {
            FileWriter theWriter = new FileWriter("Participant_Grouping.txt");
            theWriter.write("Group 1:\n\n");
            for (Participant part : g1) {
                theWriter.write(part.printOut() + "\n");
            }
            theWriter.write("\n---------------\n\n");
            theWriter.write("Group 2:\n\n");
            for (Participant part : g2) {
                theWriter.write(part.printOut() + "\n");
            }
            theWriter.write("\n---------------\n\n");
            theWriter.write("Group 3:\n\n");
            for (Participant part : g3) {
                theWriter.write(part.printOut() + "\n");
            }
            theWriter.write("\n---------------\n\n");
            theWriter.write("Group 4:\n\n");
            for (Participant part : g4) {
                theWriter.write(part.printOut() + "\n");
            }
            theWriter.write("\n---------------\n\n");
            theWriter.close();
        } catch (IOException drei) {
            System.out.println("Something is definitely wrong, I can feel it.");
            drei.printStackTrace();
        }


        System.out.println("Group 1");
        for (Participant part : g1) {
            System.out.println(part.printOut());
        }
        System.out.println("Group 2");
        for (Participant part : g2) {
            System.out.println(part.printOut());
        }
        System.out.println("Group 3");
        for (Participant part : g3) {
            System.out.println(part.printOut());
        }
        System.out.println("Group 4");
        for (Participant part : g4) {
            System.out.println(part.printOut());
        }
    }

    public boolean nemesisChecker(ArrayList<Participant> pN1, ArrayList<Participant> pN2,
                                  ArrayList<Participant> pN3, ArrayList<Participant> pN4, int number,
                                  Participant p1) {
        switch (number) {
            case 1 : {
                String data = p1.getPNemesis();
                String[] numbersAsString = data.split(",");
                int[] numbers = new int[numbersAsString.length];

                for (int i = 0; i < numbersAsString.length; i++) {
                    numbers[i] = Integer.parseInt(numbersAsString[i]);
                }

                for (Participant n1 : pN1) {
                    for (int num : numbers) {
                        if (n1.getPId() == num) {
                            return true;
                        }
                    }
                }
                break;
            }
            case 2 : {
                String data = p1.getPNemesis();
                String[] numbersAsString = data.split(",");
                int[] numbers = new int[numbersAsString.length];

                for (int i = 0; i < numbersAsString.length; i++) {
                    numbers[i] = Integer.parseInt(numbersAsString[i]);
                }

                for (Participant n2 : pN2) {
                    for (int num : numbers) {
                        if (n2.getPId() == num) {
                            return true;
                        }
                    }
                }
                break;
            }
            case 3 : {
                String data = p1.getPNemesis();
                String[] numbersAsString = data.split(",");
                int[] numbers = new int[numbersAsString.length];

                for (int i = 0; i < numbersAsString.length; i++) {
                    numbers[i] = Integer.parseInt(numbersAsString[i]);
                }

                for (Participant n3 : pN3) {
                    for (int num : numbers) {
                        if (n3.getPId() == num) {
                            return true;
                        }
                    }
                }
                break;
            }
            case 4 : {
                String data = p1.getPNemesis();
                String[] numbersAsString = data.split(",");
                int[] numbers = new int[numbersAsString.length];

                for (int i = 0; i < numbersAsString.length; i++) {
                    numbers[i] = Integer.parseInt(numbersAsString[i]);
                }

                for (Participant n4 : pN4) {
                    for (int num : numbers) {
                        if (n4.getPId() == num) {
                            return true;
                        }
                    }
                }
                break;
            }
        }
        return false;
    }
}
