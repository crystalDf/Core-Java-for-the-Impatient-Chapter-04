package ch04.ex05;

public abstract class Shape {

    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void moveBy(double dx, double dy) {

        point = new Point(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCenter();
}
