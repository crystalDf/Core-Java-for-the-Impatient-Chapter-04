package ch04.ex04;

public class Ex04 {

    public static void main(String[] args) {

        Circle circle = new Circle(new Point(2, 2), 2);

        System.out.println(circle.getCenter());

        Rectangle rectangle = new Rectangle(new Point(3, 4), 5, 6);

        System.out.println(rectangle.getCenter());

        Line line = new Line(new Point(3, 3), new Point(8, 10));

        System.out.println(line.getCenter());
    }
}
