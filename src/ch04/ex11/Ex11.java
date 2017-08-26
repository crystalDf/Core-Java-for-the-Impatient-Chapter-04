package ch04.ex11;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Ex11 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = Class.forName("java.lang.System");

        for (Field field : clazz.getDeclaredFields()) {

            field.setAccessible(true);
            if (Objects.equals(field.getName(), "out")) {

                PrintStream out = (PrintStream) field.get(null);

                Method method = out.getClass().getMethod("println", String.class);

                method.invoke(out, "Hello, World");
            }
        }
    }
}
