package exceptionHandling;

public class ThrowExceptionExample {
    static void method() {
        try {
            throw new ArithmeticException("error");         //exception thrown using throw keyword
        } catch (ArithmeticException e) {                       //catched that exception
            System.out.println("Exception using throw");
        }
    }

    public static void main(String[] args) {
        method();                                   //method called in main
    }
}
