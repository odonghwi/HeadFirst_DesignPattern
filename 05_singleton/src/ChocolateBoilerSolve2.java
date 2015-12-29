/*

    Solve2 : create instance from the beginning

*/

public class ChocolateBoilerSolve2 {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoilerSolve2 uniqueInstance = new ChocolateBoilerSolve2();

    public ChocolateBoilerSolve2() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSolve2 getInstance() {
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
