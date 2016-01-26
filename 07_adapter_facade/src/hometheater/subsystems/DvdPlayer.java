package hometheater.subsystems;

public class DvdPlayer {

    Amplifier amplifier;

    public void on() {
        System.out.println("DVD on");
    }

    public void off() {
        System.out.println("DVD off");
    }

    public void eject() {
        System.out.println("DVD eject");
    }

    public void pause() {
        System.out.println("DVD pause");
    }

    public void play() {
        System.out.println("DVD play");
    }

    public void setSurroundAudio() {
        System.out.println("DVD set surround audio");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVD set two channel audio");
    }

    public void stop() {
        System.out.println("DVD stop");
    }
}
