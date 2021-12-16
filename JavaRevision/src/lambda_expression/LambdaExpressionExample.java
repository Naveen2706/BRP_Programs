package lambda_expression;

import java.util.ArrayList;

interface Sam {
    public void sayHello();
}

interface Sam2 {
    void printAge(int age);
}

interface Sam3 {
    int calNumOfMonthsLeft(int numOfMonthsInYear, int currentMonth);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        /*-----------------parameterless method------------------*/
        Sam lamdaObj = () -> {                              //body given by lambda expression
            System.out.println("Hello everyone");
        };
        lamdaObj.sayHello();                                //Sam1

        /*-----------------------parameterised Method-----------------------*/
        Sam2 parameterObj = (age) -> {                    //body to sam is given by lambda expression
            System.out.println("My age is :" + age);
        };
        parameterObj.printAge(25);

        /*---------------Muliple Parameter---------------------------------*/
        Sam3 multiParameterObj = (monthsInYear, currentMonth) -> {
            int monthsLeft = monthsInYear - currentMonth;
            return monthsLeft;                    //return keyword used in lambda exp
        };
        System.out.println("Number of Months left :" + multiParameterObj.calNumOfMonthsLeft(12, 10));

        /*-----------------------------------Foreach loop use ------------------------*/
        ArrayList<String> list = new ArrayList<String>();

        list.add("Anish");
        list.add("Abhijit");
        list.add("Kuldeep");
        list.add("Yuvi");

        System.out.println("Foreach via lambda expression, Friends Name :");
        list.forEach((n) -> System.out.println(n));
    }
}
