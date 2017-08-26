package ch04.sec05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        for (int i = 0; i < employees.length; i++) {

            Employee employee = new Employee();
            employees[i] = employee;
        }

        printEmployees(employees);

        System.out.println();

        employees = Arrays.copyOf(employees, employees.length * 2);

        printEmployees(employees);

        System.out.println();

//        Exception in thread "main" java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Lch04.sec05.Employee;
//        employees = (Employee[]) badCopyOf(employees, employees.length + 10);

        employees = (Employee[]) goodCopyOf(employees, employees.length + 10);

        printEmployees(employees);

        System.out.println();
    }

    public static Object[] badCopyOf(Object[] array, int newLength) {

        Object[] newArray = new Object[newLength];

        for (int i = 0; i < Math.min(array.length, newLength); i++) {

            newArray[i] = array[i];
        }

        return newArray;
     }

     public static Object goodCopyOf(Object array, int newLength) {

        Class<?> clazz = array.getClass();

        if (!clazz.isArray()) {
            return null;
        }

        Class<?> componentType = clazz.getComponentType();

        int length = Array.getLength(array);

        Object newArray = Array.newInstance(componentType, newLength);

         for (int i = 0; i < Math.min(length, newLength); i++) {

             Array.set(newArray, i, Array.get(array, i));
         }

         return newArray;
     }

     private static void printEmployees(Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] != null) {
                System.out.println(employees[i].getName() + " " + employees[i].getSalary());
            } else {
                System.out.println("Empty");
            }
        }
     }
}
