package starbuzzsize.concretecomponent;

import starbuzzsize.component.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast () {
        description = "다크 로스트";
    }

    public double cost() {

        if (getSize() == Size.TALL) {
            return 0.99;
        } else if (getSize() == Size.GRANDE) {
            return 1.99;
        } else if (getSize() == Size.VENTI) {
            return 2.99;
        } else {
            return 0.99;
        }
    }
}
