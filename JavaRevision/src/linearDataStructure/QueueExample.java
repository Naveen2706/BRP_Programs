package linearDataStructure;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Stream;

public class QueueExample {
    Queue queue = new PriorityQueue();

    public static void main(String[] args) {
        QueueExample obj = new QueueExample();

        obj.queue.add("Hello");                                 //addition of element
        obj.queue.add("it's");
        obj.queue.add("monday");

        System.out.println(obj.queue);

        System.out.println(obj.queue.peek());                   //FIFO - first element

        obj.queue.remove("Hello");
        System.out.println(obj.queue);

        System.out.println("print using string stream api");
        obj.method(obj.queue);

        System.out.println(obj.queue.contains("monday"));               //checks if element is present
    }

    void method(Queue queue) {                      //print using stream api
        queue.stream().forEach(System.out::println);
    }
}
