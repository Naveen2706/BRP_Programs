import java.util.Scanner;
import java.util.regex.*;

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value");
        String str = scanner.next();
        validateInput(str);
        System.out.println(str);
        scanner.close();
    }

    private static void validateInput(String str) {
        System.out.println(Pattern.matches("[a-z[A-Z]]{3}[!@#$%^&*<>]{3}[0-9]{5}", str));
    }
}
