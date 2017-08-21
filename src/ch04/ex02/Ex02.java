package ch04.ex02;


import java.util.Objects;

public class Ex02 {

    public static void main(String[] args) {

        Point point = new Point(1, 2);

        System.out.println(point);

        LabeledPoint labeledPoint = new LabeledPoint(3,4, "star");

        System.out.println(labeledPoint);

        Point otherPoint = new Point(3, 4);

        System.out.println(Objects.equals(point, otherPoint));

        LabeledPoint otherLabeledPoint = new LabeledPoint(3, 4, "star");

        System.out.println(Objects.equals(labeledPoint, otherLabeledPoint));
    }
}
