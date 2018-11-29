package Student;

import java.util.Random;
import java.util.Scanner;

public class StudentMain {
	public String studentName;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Intro i = new Intro();
		System.out.println(i);
		String studentName = i.getStudentName();
		int id = scan.nextInt();
		if (id == 0)
		{
			Random rand = new Random();
			int randID = 100000000 + rand.nextInt(900000000);
			id = randID;
		}
		System.out.println("Student Name: " + studentName);
		System.out.println("Student id Number: " + id);
		
	    System.out.println("Copy and Paste this for a 2D Array example!(Finds the max sum of "
	    		+ "an hourglass)\r\n"
	    	+   "1 1 1 0 0 0\r\n" + 
	    		"0 1 0 0 0 0\r\n" + 
	    		"1 1 1 0 0 0\r\n" + 
	    		"0 0 2 4 4 0\r\n" + 
	    		"0 0 0 2 0 0\r\n" + 
	    		"0 0 1 2 4 0"); 
	    //Creates an instance and calls the main method of the class
	    twoDarray t = new twoDarray();
	    t.myMethod(args);
	    
	    Polymorphism p = new Polymorphism();
	    
	    System.out.println("Next up, we have an example of polymorphism with animals. It creates an"
	    + "\r\nArray with a cat and a dog and makes their respective noise with a noise method.");
	    System.out.println();
	    
	    p.polyMain(args);
	    System.out.println();
	    Queues q = new Queues();
	    q.queueMain(args);
	    
	    scan.close();
	}
	



		
}
