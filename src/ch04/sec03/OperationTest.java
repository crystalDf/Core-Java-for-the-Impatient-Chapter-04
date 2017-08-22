package ch04.sec03;

public class OperationTest {

    public static void main(String[] args) {

        Operation op = Operation.ADD;

        int result = op.eval(1, 2);

        System.out.println(result);

        result = Operation.eval(op, 3, 4);

        System.out.println(result);

        System.out.println(op.getDeclaringClass());
        System.out.println(op.getClass());
    }
}
