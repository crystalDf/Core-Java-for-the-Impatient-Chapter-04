package ch04.sec05;

import java.lang.reflect.Field;

public class FieldsTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

        Object object = "Hello World";

        for (Field field : object.getClass().getDeclaredFields()) {

            field.setAccessible(true);
            Object value = field.get(object);

            System.out.println(field.getName() + ":" + value);
        }

        Employee employee = new Employee("Star", 10000);

        Field field = employee.getClass().getDeclaredField("salary");
        field.setAccessible(true);
        double salary = field.getDouble(employee);
        field.setDouble(employee, salary * 1.1);

        System.out.println(employee.getSalary());
    }
}
