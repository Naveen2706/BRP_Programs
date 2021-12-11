package stringcomparison;

public class EqualsIgnoreCaseExample {
    public static void main(String[] ags) {
        String orderName = "James";
        String customerName = "JaMes";

        boolean areEqual = orderName.equalsIgnoreCase(customerName);        //equalsIgnoreCase is not case sensitive like equalTo

        if (areEqual) {
            System.out.println("The customer's name matches the order name.");
        } else {
            System.out.println("The customer's name does not match the order name.");
        }
    }
}
