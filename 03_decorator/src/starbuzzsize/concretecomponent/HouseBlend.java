package starbuzzsize.concretecomponent;

import starbuzzsize.component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL) {
            return 0.89;
        } else if (getSize() == Size.GRANDE) {
            return 1.89;
        } else if (getSize() == Size.VENTI) {
            return 2.89;
        } else {
            return 0.89;
        }
    }

}
