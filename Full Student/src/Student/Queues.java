package Student;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;




public class Queues {

    public static void queueMain(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        System.out.println("Next, input your last 3 quiz grades for an example of adding and "
        		+ "removing objects from a queue.\r\n(It will remove 1 extra item and catch the"
        		+ " exception.)");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        q1.add(x);
        q1.add(y);
        q1.add(z);
        
        System.out.println("Head of queue is: " + q1.element());
                
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
        int avg = (x + y + z)/3;
        System.out.println("The average of your last 3 quiz scores is: " + avg);
      
    }

}
