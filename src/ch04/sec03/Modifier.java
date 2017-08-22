package ch04.sec03;

public enum  Modifier {

    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;

    private int mask;

    static {

        int maskBit = 1;

        for (Modifier modifier : Modifier.values()) {

            modifier.mask = maskBit;
            maskBit *= 2;
        }
    }
}
