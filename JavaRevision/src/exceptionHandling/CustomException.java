package exceptionHandling;

public class CustomException extends Exception {            //for user define exception, Exception class must be extended
    public CustomException(){
        System.out.println("This is custom exception");         //block of code when exception is thrown
    }
}

class SampleExample{
    public static void main(String[] args){
        try {
            throw new CustomException();            //thrown using throw
        } catch (CustomException e) {
            System.out.println("catch");
        }
    }
}
