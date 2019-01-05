package cave_of_programming_collections.part9_queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Part9Queues {
    public static void main(String[] args) {


        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println("Head of queue is: " + q1.element());

        try {
            q1.add(40);

        } catch (IllegalStateException e) {
            System.out.println("Tried to add too meany items to queue");
        }
        for(Integer val : q1) System.out.println("Queue values:" + val);

        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());

        try{
            System.out.println("Removed from queue: " + q1.remove());

        } catch (NoSuchElementException e){
            System.out.println("Tried to remove too many  items from queue");
        }

        //////////////////////////////////////////

        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("\nQueue 2 peek: " + q2.peek());
        q2.offer(10);
        q2.offer(20);

        if (!q2.offer(30))  System.out.println("Offer failed to add item.");
        System.out.println(q2);
        System.out.println("Queue 2 poll: " + q2.poll());
        System.out.println(q2);

    }
}
