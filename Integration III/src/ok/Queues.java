package ok;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;




public class Queues {

    public static void main(String[] args) {
        
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
    
        q1.add(10);
        q1.add(20);
        q1.add(30);
        
        System.out.println("Head of queue is: " + q1.element());
        
        try {
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue.");
        }
        
        for(Integer value: q1) {
            System.out.println("Queue value: " + value);
        }
        
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        
        try {
            System.out.println("Removed from queue: " + q1.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove too many items from queue");
        }
      
    }

}
