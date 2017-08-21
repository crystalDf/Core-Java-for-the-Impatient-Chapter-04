package ch04.ex05;

import java.util.Objects;

public class Ex05 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Circle circle = new Circle(new Point(2, 2), 2);

        System.out.println(circle.getCenter());

        Rectangle rectangle = new Rectangle(new Point(3, 4), 5, 6);

        System.out.println(rectangle.getCenter());

        Line line = new Line(new Point(3, 3), new Point(8, 10));

        System.out.println(line.getCenter());

        Circle clonedCircle = (Circle) circle.clone();

        clonedCircle.moveBy(1, 1);

        System.out.println(clonedCircle.getCenter());

        System.out.println(Objects.equals(circle, clonedCircle));
    }
}
