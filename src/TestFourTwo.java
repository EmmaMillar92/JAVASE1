import java.lang.StringBuilder; // This appear to not be needed? But is the import
public class TestFourTwo {
    public static void main(String[] args) {

    	String word = "Testing the StringBuilder";
    	StringBuilder builder = new StringBuilder(word);
    	 System.out.println("The buffer is... " + builder);
    	 System.out.println("The reverse of the string is... " + builder.reverse());

}
}
