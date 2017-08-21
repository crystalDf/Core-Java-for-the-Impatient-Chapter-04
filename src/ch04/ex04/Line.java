package ch04.ex04;

public class Line extends Shape {

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
}
