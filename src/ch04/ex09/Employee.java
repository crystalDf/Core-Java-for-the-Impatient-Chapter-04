package ch04.ex09;

import java.lang.reflect.Field;

public class Employee {

    private String name;
    private double salary;
    private Employee manager;

    public Employee() {
        this("Star", 10000, new Employee("Crystal", 20000));
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, double salary, Employee manager) {
        this.name = name;
        this.salary = salary;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\n");

        for (Field field : getClass().getDeclaredFields()) {

            field.setAccessible(true);
            Object value = null;
            try {
                value = field.get(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            stringBuilder.append(field.getName()).append(":").append(value).append("\n");
        }

        return stringBuilder.toString();
    }
}
