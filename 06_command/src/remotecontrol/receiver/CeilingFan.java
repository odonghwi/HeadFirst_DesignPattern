package remotecontrol.receiver;

public class CeilingFan {

    String position = "";
    String speed;


    public CeilingFan(String position) {
        this.position = position;
    }

    public void high() {
        System.out.println(position + " celling fan is on high");
    }

    public void medium() {
        System.out.println(position + " celling fan is on medium");
    }

    public void low() {
        System.out.println(position + " celling fan is on low");
    }

    public void off() {
        System.out.println(position + " celling fan is Off");
    }



}
