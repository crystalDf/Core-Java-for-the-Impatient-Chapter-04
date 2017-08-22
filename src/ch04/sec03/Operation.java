package ch04.sec03;

public enum Operation {

    ADD {
        @Override
        public int eval(int arg1, int arg2) {
            return arg1 + arg2;
        }
    },

    SUBTRACT {
        @Override
        public int eval(int arg1, int arg2) {
            return arg1 - arg2;
        }
    },

    MULTIPLY {
        @Override
        public int eval(int arg1, int arg2) {
            return arg1 * arg2;
        }
    },

    DIVIDE {
        @Override
        public int eval(int arg1, int arg2) {
            return arg1 / arg2;
        }
    };

    public abstract int eval(int arg1, int arg2);

    public static int eval(Operation operation, int arg1, int arg2) {

        int result = 0;

        switch (operation) {

            case ADD:
                result = arg1 + arg2;
                break;

            case SUBTRACT:
                result = arg1 - arg2;
                break;

            case MULTIPLY:
                result = arg1 * arg2;
                break;

            case DIVIDE:
                result = arg1 / arg2;
                break;
        }

        return result;
    }
}
