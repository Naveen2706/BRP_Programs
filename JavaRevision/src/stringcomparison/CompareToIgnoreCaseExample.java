package stringcomparison;

public class CompareToIgnoreCaseExample {
    public static void main(String[] ags) {
        String orderName = new String("James");
        String customerName = new String("JAme");

        int difference = orderName.compareToIgnoreCase(customerName);

        System.out.println("Difference: " + difference);


    }
}
