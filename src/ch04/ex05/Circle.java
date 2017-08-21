package ch04.ex05;

public class Circle extends Shape implements Cloneable {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Point clonedPoint = (Point) getPoint().clone();

        Circle cloned = new Circle(clonedPoint, radius);

        return cloned;
    }
}
