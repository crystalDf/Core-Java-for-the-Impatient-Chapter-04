package ch04.ex13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex13 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = Math.class.getMethod("sqrt", double.class);

        printMethodValue(method, 1, 100, 10);

        System.out.println();

        method = Double.class.getMethod("toHexString", double.class);

        printMethodValue(method, 1, 100, 10);

        System.out.println();
    }

    public static void printMethodValue(Method method,
                                        double low, double high, double step) throws InvocationTargetException, IllegalAccessException {

        for (double value = low; value < high; value += step) {
            System.out.println(method.invoke(null, value));
        }
    }
}
