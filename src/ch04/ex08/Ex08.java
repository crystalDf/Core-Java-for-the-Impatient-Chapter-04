package ch04.ex08;

import java.util.ArrayList;
import java.util.List;

public class Ex08 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list.getClass().getCanonicalName());
        System.out.println(list.getClass().getSimpleName());
        System.out.println(list.getClass().getTypeName());
        System.out.println(list.getClass().getName());
        System.out.println(list.getClass().toString());
        System.out.println(list.getClass().toGenericString());

        System.out.println();

        String[] strings = {};

        System.out.println(strings.getClass().getCanonicalName());
        System.out.println(strings.getClass().getSimpleName());
        System.out.println(strings.getClass().getTypeName());
        System.out.println(strings.getClass().getName());
        System.out.println(strings.getClass().toString());
        System.out.println(strings.getClass().toGenericString());

        System.out.println();

        StaticInner staticInner = new StaticInner();

        System.out.println(staticInner.getClass().getCanonicalName());
        System.out.println(staticInner.getClass().getSimpleName());
        System.out.println(staticInner.getClass().getTypeName());
        System.out.println(staticInner.getClass().getName());
        System.out.println(staticInner.getClass().toString());
        System.out.println(staticInner.getClass().toGenericString());

        System.out.println();

        Outer.Inner outerInner = (new Outer()).new Inner();

        System.out.println(outerInner.getClass().getCanonicalName());
        System.out.println(outerInner.getClass().getSimpleName());
        System.out.println(outerInner.getClass().getTypeName());
        System.out.println(outerInner.getClass().getName());
        System.out.println(outerInner.getClass().toString());
        System.out.println(outerInner.getClass().toGenericString());

        System.out.println();

        int zero = 0;
    }

    static class StaticInner {

    }
}
