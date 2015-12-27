package starbuzz.concretedecorator;

import starbuzz.component.Beverage;
import starbuzz.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
