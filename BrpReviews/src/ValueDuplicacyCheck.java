import java.util.ArrayList;
import java.util.Scanner;

public class ValueDuplicacyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> intList = new <Integer>ArrayList();

        System.out.println("input the number of values");
        int valueCount = scanner.nextInt();

        System.out.println("enter the values");
        for (int count = 0; count < valueCount; count++) {
            intList.add(scanner.nextInt());
        }
        System.out.println(intList);
        System.out.println(checkValueRepetition(intList));
    }

    static boolean checkValueRepetition(ArrayList<Integer> intList) {
        ArrayList<Integer> copiedList = intList;
        for (int i = 0; i < intList.size(); i++) {
            for (int j = i + 1; j < copiedList.size(); j++) {
                if (intList.get(i) == copiedList.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
