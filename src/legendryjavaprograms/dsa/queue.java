package legendryjavaprograms.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

    public static void main(String[] args) {
        // Queue = FIFO data structure. First-In First-Out
        // A collection designed for holding elements prior to processing
        // Linear data structure

        // enqueue = offer()
        // dequeue = poll()

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<>();
        //This line creates a Queue of String type using LinkedList, 
        //leveraging the flexibility of the Queue interface with LinkedList's efficient insertion and deletion capabilities.

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        
        System.out.println(queue); // Prints the queue
        System.out.println(queue.peek()); // gives the element that it deleted
        queue.poll(); // remove the first element from the queue i.e., Karen
        System.out.println(queue);//prints the new queue
        //3 methods that queue inherits from collection class are : isEmpty,size,contains
        System.out.println(queue.isEmpty()); //returns true if queue is empty if queue is not empty it returns false 
        System.out.println(queue.size());//gives the size of the current queue
        System.out.println(queue.contains("Harold"));//it gives if the given element is present in the queue r not it returns a boolean value.
        System.out.println(queue.peek());// gives the element that it deleted
        queue.poll(); // remove the first element from the current queue i.e., Chad
        System.out.println(queue);//prints the new queue
        
    }
}

//Explain about queue?
//If you're asked about the `Queue` interface in an interview, you can provide a concise yet comprehensive explanation. Here’s how you could structure your response:
//
//---
//
//**1. **Introduction to Queue Interface:**
//   
//   "The `Queue` interface in Java is part of the `java.util` package and represents a collection designed for holding elements prior to processing. It follows the First-In-First-Out (FIFO) principle, meaning that the elements are added at the end of the queue and removed from the front."
//
//**2. **Key Characteristics:**
//   
//   - **FIFO Ordering:** "Elements in a `Queue` are ordered in a FIFO manner. The first element added will be the first one to be removed."
//   - **Methods:** "`Queue` provides several important methods, such as `add()`, `offer()`, `remove()`, `poll()`, `element()`, and `peek()`. `add()` and `remove()` throw exceptions if the operation fails, while `offer()` and `poll()` return special values (true/false or null) instead."
//   - **Null Handling:** "Most implementations of `Queue` do not allow `null` elements, as `null` is often used as a special return value to indicate the absence of an element."
//
//**3. **Implementations:**
//   
//   - "There are several implementations of the `Queue` interface in Java, each suited for different use cases. Common implementations include:
//    ** - `LinkedList`: A doubly-linked list implementation that can be used as a queue.
//     - `PriorityQueue`: A queue where elements are ordered according to their natural ordering or by a `Comparator`.
//     - `ArrayDeque`: An implementation that can be used as both a queue and a stack.
//     **- `BlockingQueue` and its subtypes (`ArrayBlockingQueue`, `LinkedBlockingQueue`, etc.): Used in concurrent programming to block when attempting to add to a full queue or remove from an empty one."
//
//**4. **Use Cases:**
//   
//   - "Queues are commonly used in scenarios where we need to manage tasks or events in the order they occur, such as task scheduling, breadth-first search algorithms, and implementing producer-consumer problems."
//
//**5. **Advantages:**
//   
//   - "Queues provide a clean and straightforward way to handle ordered processing, support multiple implementations for flexibility, and are foundational for several concurrent data structures in Java."
//
//**6. **Final Point:**
//   
//   - "By using the `Queue` interface, we can design our code to be more flexible, as we can easily switch between different implementations without changing the code that uses the queue."
//
//---
//
