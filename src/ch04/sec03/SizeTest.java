package ch04.sec03;

public class SizeTest {

    public static void main(String[] args) {

        Size notMySize = Size.valueOf("SMALL");

        System.out.println(notMySize);

        System.out.println();

        Size[] allValues = Size.values();

        for (Size size : allValues) {

            System.out.println(size);
        }

        System.out.println();

        System.out.println(Size.MEDIUM.ordinal());
    }
}
