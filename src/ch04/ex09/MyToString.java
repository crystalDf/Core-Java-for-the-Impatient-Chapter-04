package ch04.ex09;

import java.lang.reflect.Field;

public class MyToString {

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
