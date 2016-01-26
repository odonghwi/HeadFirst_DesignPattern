package hook;

public class BeverageTestDrive {

    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("차 준비중...");
        teaWithHook.prepareRecipe();

        System.out.println("커피 준비중...");
        coffeeWithHook.prepareRecipe();


    }
}
