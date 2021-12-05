import java.util.Scanner;

public class OutputDuplicateChar {
    public static void main(String[] args) {
        dublicateChar();
    }

    static void dublicateChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the word to be checked for dublicate character");
        String word = scanner.nextLine();
        char[] arr = word.toCharArray();
        char[] tempArr = arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == tempArr[j]) {
                    System.out.println("repeated character :" + arr[i]);
                }
            }
        }
    }
}