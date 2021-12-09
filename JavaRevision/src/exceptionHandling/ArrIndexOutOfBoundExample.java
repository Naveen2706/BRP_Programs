package exceptionHandling;

public class ArrIndexOutOfBoundExample {
    public static void main(String[] args) {
        try {
            int [] arr = new int[5];
            arr [7] = 77;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of bound");        }
    }
}
