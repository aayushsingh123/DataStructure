package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        // Queue ka instance banate hain
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue operations
        System.out.println("Enqueue elements:");
        queue.offer(10); // Enqueue 10
        queue.offer(20); // Enqueue 20
        queue.offer(30); // Enqueue 30
        System.out.println("Current Queue: " + queue); // Output: [10, 20, 30]

        // Peek operation
        System.out.println("Front element (Peek): " + queue.peek()); // Output: 10

        // Dequeue operation
        System.out.println("Dequeue operation (Remove front): " + queue.remove()); // Output: 10
        System.out.println("Current Queue after Dequeue: " + queue); // Output: [20, 30]

        // Poll operation
        System.out.println("Poll operation (Remove front): " + queue.poll()); // Output: 20
        System.out.println("Current Queue after Poll: " + queue); // Output: [30]

        // Check if queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Output: false

        // Removing last element
        queue.poll(); // Remove 30
        System.out.println("Current Queue after removing last element: " + queue); // Output: []

        // Check if queue is empty again
        System.out.println("Is the queue empty now? " + queue.isEmpty()); // Output: true
    }
}


//Explanation 
/*
--> Enqueue Elements: 10, 20, aur 30 queue mein add kiye gaye.
--> Peek Operation: Queue ke front element ko dekhte hain, jo 10 hai.
--> Dequeue Operation: Pehle element (10) ko remove kiya gaya.
--> Poll Operation: Agla element (20) ko remove kiya gaya aur queue mein sirf 30 bacha.
--> isEmpty Check: Pehle check mein queue khaali nahi hai, lekin last mein jab sabhi elements remove ho gaye, toh khaali hai.

*/