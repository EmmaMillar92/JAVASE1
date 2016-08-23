public class TaskSixAttemptThree {
 

// Defining the range of numbers
public static void main(String[] args) {
 
long startTime = System.currentTimeMillis();
long starting_number = 1;
 
long ending_number = 2999999L;
 
long totals = 0;
 

//Output
System.out.println("List of prime numbers between " + starting_number + " and " + ending_number);
 

//Calculation for prime numbers
for (long current = starting_number; current <= ending_number; current++) {
 // for (long i =1; i <= limit; i++){

long sqr_root = (long) Math.sqrt(current);
//long sqr_root=(long) Math.sqrt(i)
boolean is_prime = true;
 
for (long i = 2; i <= sqr_root; i++) {
 
if (current % i == 0) {
 
is_prime = false; // Current is not prime.
 
}
 
}
 
if (is_prime) {
 
System.out.println(current);
 
totals++;
 
}
 
}
 
 
//Calculating and printing time taken
long endTime = System.currentTimeMillis();
long totalTime = endTime - startTime;
System.out.println(totalTime);
 
System.out.println("There are a total of "+totals+" prime numbers between "+starting_number+" and "+ending_number+ " Time taken to run program: "+totalTime);
 
}
 
}