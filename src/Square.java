public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        //setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() +
                " which is a subclass of " + super.toString();
    }
}
