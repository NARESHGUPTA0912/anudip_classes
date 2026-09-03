package collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();
        System.out.println("************-- Welcome to our hotel. --*************");
        System.out.println("Available Customers :");
        
        customers.offer("Prince");
        customers.offer("Naresh");
        customers.offer("Vijay");
        customers.offer("Rohit");
        customers.offer("Shivam");      // 1

        System.out.println(customers);    // 2

        while(!customers.isEmpty()) {                        // 4
            System.out.println("Next Customer: " + customers.peek());      // 3
            System.out.println("Serving: " + customers.poll());            // 5
        }

        if(customers.isEmpty()) {                           // 6
            System.out.println("All Customers has been served.");     // 7
        }
        
    }
}