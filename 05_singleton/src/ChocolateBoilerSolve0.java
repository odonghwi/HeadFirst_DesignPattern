/*

    Solve 0 : classic singleton

 */

public class ChocolateBoilerSolve0 {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSolve0 uniqueInstance;

    public ChocolateBoilerSolve0() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSolve0 getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSolve0();
        }
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
