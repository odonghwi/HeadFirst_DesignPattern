package beverage;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끊이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

}
