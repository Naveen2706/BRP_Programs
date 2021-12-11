package stringcomparison;

public class EqualToExample {
    public static void main(String[] ags) {
//        String orderName = "James";
//        String customerName = "James";

        String orderName = new String("Naveen");        //created obj of String class
        String customerName = new String("Naveen");

        boolean areEqual = orderName.equals(customerName);      //equalTo can compares string object

        if (areEqual) {
            System.out.println("The customer's name matches the order name.");
        } else {
            System.out.println("The customer's name does not match the order name.");
        }
    }
}
