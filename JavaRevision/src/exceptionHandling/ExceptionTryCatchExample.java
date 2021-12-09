package exceptionHandling;

public class ExceptionTryCatchExample {
    public static void main(String[] args) {
        try {                                      //try block contain code where exception can occur
            int a = 50, b = 0;
            int c = a / b;                         //runtime exception will be thrown -arithematic exception
            System.out.println(c);
        } catch (ArithmeticException e) {          //catch block cathes the exception
            System.out.println("Can't divide number by zero");
        } finally {                             //finally block is always executed
            System.out.println("Finally is always Executed");
        }

    }
}
