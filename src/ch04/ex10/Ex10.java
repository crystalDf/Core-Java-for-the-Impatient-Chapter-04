package ch04.ex10;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex10 {

    public static void main(String[] args) {

        Class<?> clazz = int[].class;

        while (clazz != null) {

            for (Method method : clazz.getDeclaredMethods()) {

                System.out.println(

                        Modifier.toString(method.getModifiers()) + " " +
                                method.getReturnType().getCanonicalName() + " " +
                                method.getName() +
                                Arrays.toString(method.getParameters())
                );
            }

            System.out.println();

            clazz = clazz.getSuperclass();
        }
    }
}
