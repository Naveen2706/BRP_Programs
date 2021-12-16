    /*important - regex is only for String data type*/

    package regex;

    import java.util.Scanner;
    import java.util.regex.Pattern;

    public class RegexExample {

        static void validation(String c, String i, String str, String specialChar) {
            System.out.println("char input " + Pattern.matches("[a-zA-Z]?", c));
            System.out.println("int input " + Pattern.matches("[0-9]?", i));
            System.out.println("string input " + Pattern.matches("[a-zA-Z]+", str));
            System.out.println("special character input " + Pattern.matches("[!@#$%^&*()_+-><?]+", specialChar));
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter character");
            String c = in.next();
            System.out.println(c);

            System.out.println("Enter integer");
            String i = in.next();
            System.out.println(i);

            System.out.println("Enter word");
            String str = in.next();
            System.out.println(str);

            System.out.println("Enter special character");
            String specialChar = in.next();
            System.out.println(specialChar);

            in.close();

            validation(c, i, str, specialChar);              //validation method with regex
        }
    }
