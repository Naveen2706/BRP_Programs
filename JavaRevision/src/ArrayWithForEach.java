import java.util.Arrays;

class ArrayWithForEach {

    public static void main(String[] args) {
        String[] car = {"Naveen", "Anish", "Abhijit"};
        System.out.println(Arrays.toString(car));           //  method returns a string representation of the contents of the specified int array
        System.out.println("Array by for-each ");
        for (String s : car) {                  //iterating through each element
            System.out.println(s);
        }
    }
}