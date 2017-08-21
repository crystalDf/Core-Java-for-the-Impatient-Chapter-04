package ch04.ex05;

public class Line extends Shape implements Cloneable {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {

        moveBy((to.getX() - getPoint().getX()) / 2,
                (to.getY() - getPoint().getY()) / 2);

        return getPoint();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Point clonedPoint = (Point) getPoint().clone();

        Line cloned = new Line(clonedPoint, to);

        return cloned;
    }
}
