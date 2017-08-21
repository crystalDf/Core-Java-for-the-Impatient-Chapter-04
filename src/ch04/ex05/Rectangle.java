package ch04.ex05;

public class Rectangle extends Shape implements Cloneable {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {

        moveBy(width / 2, height / 2);

        return getPoint();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Point clonedPoint = (Point) getPoint().clone();

        Rectangle cloned = new Rectangle(clonedPoint, width, height);

        return cloned;
    }
}
