package exceptionHandling;

public class NumFormatExceptionExample {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("Hello");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
