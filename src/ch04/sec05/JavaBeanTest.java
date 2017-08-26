package ch04.sec05;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class JavaBeanTest {

    public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {

        Employee employee = new Employee("Star", 10000);

        Class<?> clazz = Employee.class;

        BeanInfo beanInfo = Introspector.getBeanInfo(clazz);

        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        String propertyName = "name";

        Object propertyValue = null;

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {

            if (Objects.equals(propertyDescriptor.getName(), propertyName)) {

                propertyValue = propertyDescriptor.getReadMethod().invoke(employee);
            }
        }

        System.out.println(propertyValue);
    }
}
