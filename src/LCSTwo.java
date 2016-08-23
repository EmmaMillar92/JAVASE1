import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
//Class
public class  LCSTwo{
    // add function
    public String lcs(String StringOne, String StringTwo) //public string- return type string
    {
        int LengthOne = StringOne.length(); //define string lengths
        int LengthTwo = StringTwo.length();
 
        int[][] arr = new int[LengthOne + 1][LengthTwo + 1]; //define integer
 
        for (int i = LengthOne - 1; i >= 0; i--)
        {
            for (int j = LengthTwo - 1; j >= 0; j--)
            {
                if (StringOne.charAt(i) == StringTwo.charAt(j)) // charAt returns first character of string
                    arr[i][j] = arr[i + 1][j + 1] + 1;
                else 
                    arr[i][j] = Math.max(arr[i + 1][j], arr[i][j + 1]); //Math.max returns largest number 
            }
        }
 
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer(); //constructs a string buffer
        while (i < LengthOne && j < LengthTwo) // whilst i is less than the number of characters in both string one and string two
        {
            if (StringOne.charAt(i) == StringTwo.charAt(j))  //if the value of the characters at a point in the string are equal- 
            {
                sb.append(StringOne.charAt(i)); //update the string buffer 
                i++;		//go to next character in string one
                j++;		// go to next character in string two
            }
            else if (arr[i + 1][j] >= arr[i][j + 1]) 
                i++; //next character in string one
            else
                j++; //next character in string two
        }
        return sb.toString(); //Returns a string that contains the character sequence in the builder.
    }
 
   // add Main class
    public static void main(String[] args) throws IOException 
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //used when input is a string
 
        System.out.println("Enter first string:");
        String StringOne = br.readLine();
 
        System.out.println("\n Enter second string:");
        String StringTwo = br.readLine();
 
        LCS obj = new LCS(); 
        String result = obj.lcs(StringOne, StringTwo); //object
        int LengthResult = result.length();
 
        System.out.println("The Longest Common Subsequence (LCS) is : "+ result);
        System.out.println("This subsequence is " + LengthResult+ " characters long.");
    }
}

