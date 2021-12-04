import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();

    public static void main(String[] args) {
        ArrayListExample obj = new ArrayListExample();
        obj.cars.add("BMW");                                //add method
        obj.cars.add("Honda");
        obj.cars.add("Kia");
        System.out.println(obj.cars);

        System.out.println("after get(2) : " + obj.cars.get(2));                //get(index) method

        obj.cars.set(1,"Ford");                                             //set(index) method for modification
        System.out.println("after set(1) : " + obj.cars);

        obj.cars.remove(2);
        System.out.println("after remove(2) : " + obj.cars);                //remove(index) method

        System.out.println("after size() : " + obj.cars.size());            //size() method

        System.out.println("for each loop for arraylist");                  //for each loop with arraylist
        for (String i: obj.cars) {
            System.out.println(i);
        }

        Collections.sort(obj.cars);                                         //collection class method sort is used for sorting
        System.out.println("arraylist after sorting :" + obj.cars);

        obj.cars.clear();                                                   //for clearing arraylist
        System.out.println("after clear() :" + obj.cars);

    ArrayList<Integer> intObj = new ArrayList<Integer>();                   //integer wrapper class used
        intObj.add(50);
        intObj.add(22);
        intObj.add(55);
        intObj.add(30);
        System.out.println("integer array" + intObj);

        Collections.sort(intObj);
        System.out.println("after Collection.sort() :" + intObj);
    }
}
