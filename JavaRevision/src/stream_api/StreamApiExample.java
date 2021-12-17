package stream_api;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(101, "Anish");
        map.put(102, "Baban");
        map.put(103, "Chandrashekhar");
        map.put(104, "Deepak");
        map.put(105, "Farhan");
        map.put(106, "gurmeet");
        System.out.println(map);

        /*----------------Create a list of integer---------------------*/
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);

        /*---------------Map method--------------------------------*/
        List<Integer> square = numberList.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("square :" + square);

        /*------------------create a list of string--------------------*/
        List<String> names = Arrays.asList("Anish", "Abhijit", "Yuvi");

        /*-------------------filter method----------------------------*/
        List<String> result = names.stream().filter(x -> x.startsWith("Y")).collect(Collectors.toList());
        System.out.println("filter with 'Y' character :" + result);

        /*--------------------sort method-------------------------------*/
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println("after sorted() :" + show);

        /*------------------collect method to set -----------------------*/
        Set<Integer> squareSet = numberList.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("collected in set :" + squareSet);

        /*-------------demostration of foreach---------------------*/
        System.out.println("after using for each :");
        numberList.stream().map(x -> x * x).forEach(System.out::println);

        /*-------------------reduce method------------------------*/
        int sum = numberList.stream().reduce(0, (x, y) -> x + y);
        System.out.println("after using reduce sum is :" + sum);
    }
}
