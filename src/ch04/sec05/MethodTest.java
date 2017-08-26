package ch04.sec05;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MethodTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        String className = "java.lang.String";

        Class<?> clazz = Class.forName(className);

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

        Employee employee = new Employee("Star", 10000);

        Method method = employee.getClass().getMethod("setName", String.class);

        method.invoke(employee, "Crystal");

        System.out.println(employee.getName());
    }
}
