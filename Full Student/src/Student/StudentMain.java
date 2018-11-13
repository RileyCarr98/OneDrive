package Student;

import java.util.Scanner;

public class StudentMain {
	public String name;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Intro i = new Intro();
		System.out.println(i);
		String name = i.getStudentName();
		int id = scan.nextInt();
		Identification myID = new Identification(name,id);
		
	      System.out.println(myID);
	      scan.close();
	}
	



		
}
