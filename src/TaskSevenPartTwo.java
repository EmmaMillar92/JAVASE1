import java.util.Scanner;
public class TaskSevenPartTwo {
public static void main(String[]
		args)
			{
	Scanner user_input = new Scanner(System.in);
	String a;
	System.out.print("Enter a word ");
	a = user_input.next();
	String b;
	System.out.print("Enter another word ");
	b = user_input.next();
	String both_words;
	both_words = a + " and " + b;

	System.out.println("The words are " + both_words);
	
	
}
public static int getLongestCommonSubstring(String a, String b){
	int m = a.length();
	int n = b.length();
 
	int max = 0;
 
	int[][] dp = new int[m][n];
 
	for(int i=0; i<m; i++){
		for(int j=0; j<n; j++){
			if(a.charAt(i) == b.charAt(j)){
				if(i==0 || j==0){
					dp[i][j]=1;
				}else{
					dp[i][j] = dp[i-1][j-1]+1;
				}
 
				if(max < dp[i][j])
					max = dp[i][j];
			}
 
		}
	}
 
	return max;
}
}
// Given two strings, write a program that efficiently finds the longest common subsequence.
