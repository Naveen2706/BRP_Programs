package stringcomparison;

public class EqualOperatorExample {
        public static void main(String[] args) {
            String orderName = new String("James");
            String customerName = new String("James");

            if (orderName == customerName) {            //can't compare two string object with '==' operator
                System.out.println("The customer's name matches the order name.");
            } else {
                System.out.println("The customer's name does not match the order name.");
            }
        }
}
