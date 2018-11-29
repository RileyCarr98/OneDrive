package Student;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//2D ARRAY AND SEARCH

/*COPY THIS INTO THE INPUT: FINDS THE MAX SUM OF AN HOUR GLASS
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
*/

public class twoDarray {
	    		
    		public static void myMethod(String Args[]){
        	Scanner in = new Scanner(System.in);
        	int arr[][] = new int[6][6];
        	for(int i=0; i < 6; i++){
            	for(int j=0; j < 6; j++){
                	arr[i][j] = in.nextInt();
            	}
        	}
        	int sum = -10000;
        	for (int i = 0; i < 4; i++) {
            	for (int j = 0; j < 4; j++) {
 
               		int currentSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                   		+ arr[i+1][j+1]
                   		+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
               		if (currentSum > sum) {
                   		sum = currentSum;
               		}
            	}
        	}
        
        	System.out.println(sum);
        	
    	}
    	}
	


