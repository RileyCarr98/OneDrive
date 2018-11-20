package Student;

import java.util.Random;
import java.util.Scanner;

public class StudentMain {
	public String studentName;
	
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
		
		//Identification myID = new Identification(name,id);
		
	//      System.out.println(myID);
	    System.out.println("What were your last 5 quiz grades?");
	    
	    int count = 5;
	    int[] grades = new int[count];
	    
	    for (int b = 0; b <= count; b++)
	    {
	    	grades[count] = scan.nextInt();
	    	b++;

	    }
	    System.out.println(grades[count]);
	    
	      scan.close();
	}
	



		
}
