package starbuzzsize.concretecomponent;

import starbuzzsize.component.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL) {
            return 1.05;
        } else if (getSize() == Size.GRANDE) {
            return 2.05;
        } else if (getSize() == Size.VENTI) {
            return 3.05;
        } else {
            return 1.05;
        }}
}
