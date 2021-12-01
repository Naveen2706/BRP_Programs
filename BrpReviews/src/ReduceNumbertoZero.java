import java.util.Scanner;

public class ReduceNumbertoZero {

    public static int numberOfSteps(int num) {
        int stepsCount = 0;
        for (; num > 0; stepsCount++) {
            if (num % 2 == 1) {
                num--;
                System.out.println(num);
            } else {
                num /= 2;
                System.out.println(num);
            }
            System.out.println("step number :" + (stepsCount + 1));
        }
        return stepsCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scanner.nextInt();
        int stepsCount = numberOfSteps(num);
        System.out.println("number of steps :" + stepsCount);
        scanner.close();
    }
}
