package hometheater.subsystems;

public class TheaterLights {

    int dim;

    public void on() {
        dim = 50;
        System.out.println("TheaterLights on");
    }

    public void off() {
        dim = 0;
        System.out.println("TheaterLights off");
    }

    public void dim(int dim) {
        this.dim = dim;
        System.out.println("TheatherLights dimming to " + dim + "%");
    }

}
