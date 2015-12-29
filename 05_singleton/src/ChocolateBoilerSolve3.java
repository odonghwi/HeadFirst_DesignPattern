/*

    using DCL(Double-Checking-Locking)

*/

public class ChocolateBoilerSolve3 {

    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoilerSolve3 uniqueInstance;

    public ChocolateBoilerSolve3() {
        empty = true;
        boiled = false;
    }

    private static ChocolateBoilerSolve3 getInstance() {

        if(uniqueInstance == null) {
            synchronized (ChocolateBoilerSolve3.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoilerSolve3();
                }
            }
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
