import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Levenshtein distance
public class TaskSevenPartThree {

	public static int distance(String a, String b) {
		// a = a.toLowerCase();
		// b = b.toLowerCase(); //converts all strings to the lowercase

		int [] num = new int [b.length() + 1]; //array 
		for (int j = 0; j < num.length; j++) //
			num[j] = j; 
		for (int i = 1; i <= a.length(); i++) {

			num[0] = i;
			int nw = i - 1;
			for (int j = 1; j <= b.length(); j++) {
				int cj = Math.min(1 + Math.min(num[j], num[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1); //math.min returns smallest number
				nw = num[j];
				num[j] = cj;
			}
		}
		return num[b.length()];
	}



	public static void main(String[] args) throws IOException  //main method allows user input and outputs the results
	{    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //used when input is a string
		System.out.println("This code calculaes the Levenshtein distance between two strings");
		System.out.println("The Levenshtein distance is defined as the minimum number of letters to tranform one string into another by insertions and/or deletions");
		System.out.println("Enter first string:");
		String StringOne = br.readLine();

		System.out.println("\n Enter second string: ");
		String StringTwo = br.readLine();


		String [] data = { StringOne, StringTwo };
		for (int i = 0; i < data.length; i += 2) //use i from method above
			System.out.println("Levenshtein distance(" + StringOne + ", " + StringTwo + ") = " + distance(data[i], data[i+1]));

	}
}


/*Given two strings, write a program that outputs the shortest 
 sequence of character insertions and deletions that turn one string into the other.
 */
