package ch04.sec04;

import java.util.Scanner;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Object object = 1;

        Class<?> clazz = object.getClass();

        System.out.println("This object is an instance of " + clazz.getName());

        System.out.println();

        String className = "java.util.Scanner";

        clazz = Class.forName(className);

        System.out.println("This object is an instance of " + clazz.getName());

        System.out.println();

        clazz = Scanner.class;

        System.out.println("This object is an instance of " + clazz.getName());

        System.out.println();

        clazz = String[].class;

        System.out.println("This object is an instance of " + clazz.getName());
        System.out.println("This object is an instance of " + clazz.getCanonicalName());

        System.out.println();

        clazz = int[].class;

        System.out.println("This object is an instance of " + clazz.getName());
        System.out.println("This object is an instance of " + clazz.getCanonicalName());

        System.out.println();

        clazz = Runnable.class;

        System.out.println("This object is an instance of " + clazz.getName());

        System.out.println();

        clazz = int.class;

        System.out.println("This object is an instance of " + clazz.getName());

        System.out.println();

        clazz = void.class;

        System.out.println("This object is an instance of " + clazz.getName());

        System.out.println();
    }
}
