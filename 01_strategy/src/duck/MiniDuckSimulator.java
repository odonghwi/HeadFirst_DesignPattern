package duck;

import duck.behaviors.fly.FlyRocketPowered;
import duck.ducks.Duck;
import duck.ducks.MallardDuck;
import duck.ducks.ModelDuck;

public class MiniDuckSimulator {


    public static void main(String args[])
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
