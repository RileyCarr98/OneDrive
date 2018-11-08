package Student;
import java.util.*;

public class Identification extends StudentMain{
	public int idNum;
	public static void main(String[] args) {
		Intro i = new Intro();
		String name = i.getStudentName();
		System.out.println("Please enter your ID Number(If you do not have an ID Number" +
				", one will be provided for you, just input a 0)");
		Scanner scan = new Scanner(System.in);
		int idNum = scan.nextInt();

	}
	
	public int stuID(int randID)
	{
		Random rand = new Random();
		randID = 100000000 + rand.nextInt(900000000);
		return randID;
		
	}
	public void setStuID(int idNum)
	{
		this.idNum = idNum;
	}
	public int getStuID()
	
	{
		return idNum;
	}

	public Identification(String studentName, int idNum)
	{
		System.out.println("Student Name: " + name);
		System.out.println("Student id Number: " + idNum);
		
	}


}
