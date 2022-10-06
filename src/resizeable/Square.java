package resizeable;

public class Square extends Rectangle {


    public Square() {

    }

    public Square(double side) {
        super(side, side);

    }

    public Square(String color, boolean fiiled, double side) {
        super(color, fiiled, side, side);

    }


    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setLength(size);

    }

    @Override
    public String toString() {
        return "A Square with length = "
                + getLength()
                + ", which is a width of"
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSize(getSize() * percent);
    }
}
