package remotecontrol.receiver;

public class Light {

    String position = "";

    public Light(String position) {
        this.position = position;
    }

    public void on()
    {
        System.out.println(position + "Light is On");
    }

    public void off()
    {
        System.out.println(position + "Light is Off");
    }
}
