package functional_Interface;

import java.util.Scanner;

@FunctionalInterface
interface Sam {
    void name(String name);                     //only one abstract method in functional interface
                                                //It can have any number of default, static methods
}

public class FunctionalInterfaceExample {

    void name(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FunctionalInterfaceExample obj = new FunctionalInterfaceExample();

        System.out.println("Enter the name : ");
        String name = scanner.next();
        obj.name(name);
        scanner.close();
    }
}
