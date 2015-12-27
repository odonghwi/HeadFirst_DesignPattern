package starbuzzsize.concretedecorator;

import starbuzzsize.component.Beverage;
import starbuzzsize.decorator.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 스팀 밀크";
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
