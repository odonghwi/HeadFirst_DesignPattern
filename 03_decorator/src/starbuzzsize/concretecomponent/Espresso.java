package starbuzzsize.concretecomponent;

import starbuzzsize.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL) {
            return 1.99;
        } else if (getSize() == Size.GRANDE) {
            return 2.99;
        } else if (getSize() == Size.VENTI) {
            return 3.99;
        } else {
            return 1.99;
        }
    }

}
