package functional_Interface;

import java.util.Scanner;

@FunctionalInterface
interface Sam {
    void name(String name);                     //only one abstract method in functional interface
    //It can have any number of default, static methods
}

public class FunctionalInterfaceExample {

    void name(String name) {
        System.out.println("name by class object :" + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FunctionalInterfaceExample obj = new FunctionalInterfaceExample();      //implementation by class obj

        Sam interfaceObj = new Sam() {                            //implementation by anonymous class
            @Override
            public void name(String name) {
                System.out.println("name by anonymous class :" + name);
            }
        };
        System.out.println("Enter the name : ");
        String name = scanner.next();
        obj.name(name);                 //implementation by class obj
        interfaceObj.name(name);        //implementation by anonymous class
        scanner.close();
    }
}
