package Student;

import java.util.Scanner;

public class StudentMain {
	public String name;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Intro i = new Intro();
		String name = i.getStudentName();
		System.out.println(i);
		int id = scan.nextInt();
		Identification myID = new Identification(name,id);
		
	      System.out.println(myID);
	      scan.close();
	}
	



		
}
