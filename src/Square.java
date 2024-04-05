public class Square extends Rectangle {
    public Square() {
    }

    public Square(double s) {
        super(s, s);
    }

    public Square(String color, boolean filled, double side1, double side2) {
        super(color, filled, side1, side2);
    }


    public double getSide() {
        return getWidth() ;
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "A Square with side = "+ getSide() +", which is a subclass of " + super.toString();
    }
}
