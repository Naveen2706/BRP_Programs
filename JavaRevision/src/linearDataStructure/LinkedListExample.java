package linearDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("Naveen");                            //to add first element explicitly
        list.addLast("Patekar");                               //to add last explicitly
        list.add("Baban");
        list.add(22);
        System.out.println(list);

        System.out.println(list.contains("Baban"));             //contain element or not

        System.out.println(list.size());                        //size of list

        list.remove("Baban");                                 //to remove
        System.out.println(list);

        ArrayList arrList = new ArrayList();
        arrList.add(list);                                          //add linkedlist to arraylist
        System.out.println(arrList);

        list.clear();
        System.out.println(list);
    }
}
