//import java.io.BufferedReader; //never used?
//import java.io.InputStreamReader; //neverysed?
import java.lang.StringBuilder; // This appear to not be needed? But is the import

public class TaskFour {
	public static void main(String[] args) {

		String word = "Testing the StringBuilder";
		StringBuilder builder = new StringBuilder(word);
		System.out.println("The buffer is... " + builder);
		System.out.println("The reverse of the string is... " + builder.reverse()); //builder.reverse reverses the string

	}
}


/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("\n Enter second string: ");
String word = System.out.println("\n Enter second string: ");br.readLine();
can own text been entered using stringbuilder?

 */
