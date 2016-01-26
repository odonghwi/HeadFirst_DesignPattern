package hometheater.subsystems;

public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void eject() {
        System.out.println("Amplifier eject");
    }

    public void pause() {
        System.out.println("Amplifier pause");
    }

    public void play() {
        System.out.println("Amplifier play");
    }

    public void setSurroundAudio() {
        System.out.println("Amplifier set surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("Amplifier set two channel audio");
    }

    public void stop() {
        System.out.println("Amplifier stop");
    }
}
