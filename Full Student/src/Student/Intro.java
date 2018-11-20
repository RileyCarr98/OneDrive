package Student;
import java.util.*;


public class Intro extends StudentMain {
	public String studentName;
	public String stuName;
	@SuppressWarnings({ "resource", "unused" })
	public Intro()
	{
		boolean t = false;
		
		do
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my integration project! Shortly the program will prompt you "
		+ "to type in a few requirements... Have fun~!");
		System.out.println("Please enter your name to begin!");
		stuName = scan.nextLine();
		System.out.println("Please re-enter your name for clarification.");
		String temp2 = scan.nextLine();
		if (stuName.equals(temp2)) 
		{
		  /*A string class method .equals is being used(Compares to see if the
		   *strings are the same.)
		   *IN the line above, if you would have used == it would have just checked to see if the
		   * strings are the same length, not the same. 
		   */
			stuName = stuName.substring(0,1).toUpperCase() 
					+ stuName.substring(1).toLowerCase();
			//Above is very complicated way to Capitalize the first letter of the name using the 
			//String method .toUppercase and .toLowerCase
			System.out.println("Hello " + stuName + "! Please enter your ID Number(If you do not "
					+ "have an ID Number"+", one will be provided for you, just input a 0)");
			t = true;
			setStudentName(stuName);
		}
		else {
			System.out.println("I didnt get that.");
			t = false;
			 }
		}
		while (t = false);
		}
		
	
	public void setStudentName(String stuName)
	{
		this.stuName = stuName;
	}
	public String getStudentName()
	{
		return stuName;
	}
	
}
