package ch04.sec05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = Employee.class;

        Employee employee = (Employee) clazz.newInstance();

        System.out.println(employee.getName() + " " + employee.getSalary());

        Constructor constructor = clazz.getConstructor(String.class, double.class);

        employee = (Employee) constructor.newInstance("Crystal", 10000);

        System.out.println(employee.getName() + " " + employee.getSalary());
    }
}
