package garagedooropen;

public class RemoteControlTest {

    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();
        //Light light = new Light();
        //LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand doorUp = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(doorUp);
        remote.buttonWasPressed();

    }

}
