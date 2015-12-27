package starbuzzsize.component;

public abstract class Beverage {

    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;
    public String description = "제목 없음";

    public String getDescription() {
        String sizeDescription = "";
        if(getSize() == Size.TALL) {
            sizeDescription = "(TALL)";
        }
        else if(getSize() == Size.GRANDE) {
            sizeDescription = "(GRANDE)";
        }
        else if(getSize() == Size.VENTI) {
            sizeDescription = "(VENTI)";
        }
        return description + sizeDescription;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();

}
