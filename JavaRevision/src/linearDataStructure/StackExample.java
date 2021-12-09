package linearDataStructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();          //LIFO
        stack.push(10);
        stack.push("Naveen");
        System.out.println(stack);
        int a = stack.search("Naveen");  //returns distance from top "search()"
        System.out.println(a);
        System.out.println(stack.peek());   //peek fetches the first element from top
        stack.pop();                        // to remove the element
        System.out.println(stack);
        System.out.println(stack.empty());      //empty checks if stack is empty
    }
}
