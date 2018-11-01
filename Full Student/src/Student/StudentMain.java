package Student;

import java.util.Scanner;

public class StudentMain {

	public static String nameIntro() {  
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Please re-enter your name for clarification.");
		String temp2 = scan.nextLine();
		
			if (name.equals(temp2)) 
			{
			  /*A string class method .equals is being used(Compares to see if the
			   *strings are the same.)
			   *IN the line above, if you would have used == it would have just checked to see if the
			   * strings are the same length, not the same. 
			   */
				name = name.substring(0,1).toUpperCase() 
						+ name.substring(1).toLowerCase();
				//Above is very complicated way to Capitalize the first letter of the name using the 
				//String method .toUppercase and .toLowerCase
				System.out.println("Hello " + name + "!");
			}
			else {
				System.out.println("I didnt get that.");
				nameIntro();
			}
			return name;
		
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Intro i = new Intro();
		nameIntro();
		System.out.println(i);
		int id = scan.nextInt();
		String name = nameIntro();
		Identification myID = new Identification(name,id);
	      System.out.println(myID);
	      scan.close();
		
		
	}
		
}
