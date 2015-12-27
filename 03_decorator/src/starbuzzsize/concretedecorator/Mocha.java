package starbuzzsize.concretedecorator;

import starbuzzsize.component.Beverage;
import starbuzzsize.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(getSize() == Size.TALL) {
            cost += 0.20;
        }
        else if(getSize() == Size.GRANDE) {
            cost += 0.30;
        }
        else if(getSize() == Size.VENTI) {
            cost += 0.40;
        }
        return cost;
    }
}
