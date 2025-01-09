package legendryjavaprograms.dsa;

// ProducerAndConsumerImplUsingBlockingQueueTest

//What is BlockingQueue? How can we implement Producer-Consumer problem using Blocking Queue?
//- java.util.concurrent.BlockingQueue is a Queue that supports operations that wait for the queue 
//to become non-empty when retrieving and removing an element, and wait for space to become 
//available in the queue when adding an element.

//- BlockingQueue doesn’t accept null values and throws NullPointerException if you try to store a null 
//value in the queue.

//- BlockingQueue implementations are thread-safe. All queuing methods are atomic in nature and 
//use internal locks or other forms of concurrency control.

//- BlockingQueue is primarily used for implementing the producer-consumer problem.

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {

    // Use java.util.concurrent.BlockingQueue instead of your own BlockingQueue class
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join(); // Ensure the main thread waits for the producer to finish
        consumerThread.join(); // Ensure the main thread waits for the consumer to finish
    }

    private static void producer() throws InterruptedException {
        Random random = new Random();
        while (true) {
            Thread.sleep(2000);
            int produced = random.nextInt(100);
            queue.put(produced);
            System.out.println("Produced: " + produced);
        }
    }

    private static void consumer() throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            Integer consumed = queue.take();
            System.out.println("Consumed: " + consumed);
        }
    }
}
