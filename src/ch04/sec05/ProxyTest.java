package ch04.sec05;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyTest {

    public static void main(String[] args) {

        Object[] values = new Object[1000];

        for (int i = 0; i < values.length; i++) {

            Object value = i;

            values[i] = Proxy.newProxyInstance(
                    null,
                    value.getClass().getInterfaces(),
                    (Object proxy, Method method, Object[] methodArgs) -> {
                        System.out.println(value + "." + method.getName() +
                                Arrays.toString(methodArgs));
                        return method.invoke(value, methodArgs);
                    }
            );
        }

        Arrays.binarySearch(values, 500);
    }
}
