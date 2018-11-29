package ok;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//THIS CLASS REQUIRES A NUMBER BUT GIVES THE EXCEPTION IF INPUTTED WRONG 

public class Exceptions {

	    public static void main(String[] args) {
	    	System.out.println("Input a number... or don't ;)");
	        Scanner scan = new Scanner(System.in);
	        
	        try {
	            int x = scan.nextInt();
	            int y = scan.nextInt();
	            System.out.println(x / y);
	        } 
	        catch(InputMismatchException e) {
	            System.out.println(e.getClass().toString().replaceFirst("class ", ""));
	        }
	        catch(ArithmeticException e) {
	            System.out.println(e);
	        }
	        scan.close();
	    }
	}


