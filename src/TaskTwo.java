import java.util.Scanner;
public class TaskTwo {
	public static void main(String args[])
	   {
	      int a;	 
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the desired number of lines");
	      a = in.nextInt(); // sets desired number of lines (integer) as a 

	  	{
	  		for (int i = 0; i < a; i++) { // number of rows based on user input 
	  			for(int j = 0; j < i; j++ ){	// adds a * to each row for j < i
	  		    System.out.print("*");
	  		}
	  			System.out.println("*");
	  	    }
	  	}
 
	   }
	
}