class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo68 {
    static void checkNumber(int num) throws MyException {
        if (num < 0) {
            throw new MyException("Number cannot be negative!");
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(10);
            checkNumber(-5);
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
