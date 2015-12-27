package starbuzzsize.concretedecorator;

import starbuzzsize.component.Beverage;
import starbuzzsize.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(getSize() == Size.TALL) {
            cost += 0.10;
        }
        else if(getSize() == Size.GRANDE) {
            cost += 0.20;
        }
        else if(getSize() == Size.VENTI) {
            cost += 0.30;
        }
        return cost;
    }
}
