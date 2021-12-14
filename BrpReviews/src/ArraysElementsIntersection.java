import java.util.ArrayList;
import java.util.Scanner;

public class ArraysElementsIntersection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements in first array ");
        int fArrayElementCount = scanner.nextInt();
        System.out.println("Enter number of element in second array");
        int sArrayElementCount = scanner.nextInt();

        int[] firstArray = new int[fArrayElementCount];
        int[] secondArray = new int[sArrayElementCount];

        System.out.println("Enter the elements in first array");
        for (int indexFArray = 0; indexFArray < fArrayElementCount; indexFArray++) {
            firstArray[indexFArray] = scanner.nextInt();
        }

        System.out.println("Enter the elements in second array");
        for (int indexSArray = 0; indexSArray < sArrayElementCount; indexSArray++) {
            secondArray[indexSArray] = scanner.nextInt();
        }
        System.out.println("the output is :" + getIntersectionValues(firstArray, secondArray));
        scanner.close();
    }

    static ArrayList getIntersectionValues(int[] firstArray, int[] secondArray) {
        ArrayList intersectionlist = new ArrayList();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    intersectionlist.add(firstArray[i]);
                    break;
                }
            }
        }
        if (intersectionlist.size() == 0) {
            System.out.println("No intersection found");
        }
        return intersectionlist;
    }
}