package starbuzzsize.concretedecorator;

import starbuzzsize.component.Beverage;
import starbuzzsize.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(getSize() == Size.TALL) {
            cost += 0.15;
        }
        else if(getSize() == Size.GRANDE) {
            cost += 0.25;
        }
        else if(getSize() == Size.VENTI) {
            cost += 0.35;
        }
        return cost;
    }
}
