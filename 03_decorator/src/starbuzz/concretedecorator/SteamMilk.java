package starbuzz.concretedecorator;

import starbuzz.component.Beverage;
import starbuzz.decorator.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
