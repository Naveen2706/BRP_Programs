package exceptionHandling;


public class ThrowsExceptionExample {
    static void method() throws ArithmeticException {       //throws is used in method signature, declare a exception
        try {
            System.out.println("inside method");
            throw new ArithmeticException("error");         //exception thrown using throw keyword
        } finally {
            System.out.println("try followed by finally");
        }
    }

    public static void main(String[] args) throws CustomException {
        try {
            method();                                   //method called in main
        } finally {
            System.out.println("this is finally from main method");
        }
    }
}

