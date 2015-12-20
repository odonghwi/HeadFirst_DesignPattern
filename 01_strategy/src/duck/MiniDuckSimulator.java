package duck;

import duck.ducks.Duck;
import duck.ducks.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();
    }
}
