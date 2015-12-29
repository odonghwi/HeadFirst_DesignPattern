/*

    Solve 1 : using synchronized

 */

public class ChocolateBoilerSolve1 {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSolve1 uniqueInstance;

    public ChocolateBoilerSolve1() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerSolve1 getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSolve1();
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
