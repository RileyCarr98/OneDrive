import java.util.Scanner;

public class Module07Looping {

  public static void do7() {
    Scanner scanner = new Scanner(System.in);
    boolean continueProgram = true;
    int menuChoice = 0;
    while (continueProgram) {

      // your program

      System.out.println("Press 1 to continue or 2 to quit.");
      menuChoice = scanner.nextInt();
      if (menuChoice == 2) {
        continueProgram = false;
      }

    }
    scanner.close();

  }

}
