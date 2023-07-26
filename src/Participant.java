public class Participant {

    private int PId;
    private String PName;
    private String PNemesis;

    public int getPId() {return PId;}

    public void setPId(int PId) {this.PId = PId;}

    public String getPName() {return PName;}

    public void setPName(String PName) {this.PName = PName;}

    public String getPNemesis() {return PNemesis;}

    public void setPNemesis(String PNemesis) {this.PNemesis = PNemesis;}

    public String printOut() {
        if (getPId() < 10) {
            return getPId() + ":  " + getPName();
        } else {
        return getPId() + ": " + getPName();
        }
    }

}
