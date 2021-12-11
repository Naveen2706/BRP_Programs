package stringcomparison;

public class CompareToExample {
        public static void main(String[] ags) {
            String orderName = "James";
            String customerName = "Bill";

            int difference = orderName.compareTo(customerName);

            System.out.println("Difference: " + difference);
    }
}
