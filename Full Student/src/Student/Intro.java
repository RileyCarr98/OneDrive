package Student;
import java.util.*;


public class Intro extends StudentMain {
	public Intro()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to my integration project! Shortly the program will prompt you "
				+ "to type in a few requirements... Have fun~!");
		System.out.println("Press enter to Start!...");
		scan.nextLine();
		System.out.println("Please enter your name and ID Number(If you do not have an ID Number" +
		", make up a 9 digit numer. i.e. 123456789");
	}

}
