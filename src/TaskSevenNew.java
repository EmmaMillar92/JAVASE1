public class TaskSevenNew {
	// Defining the range of numbers
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		long limit = 3000000000L; //add L to end for long and change types to long
		long totals = 0;

		//Calculation for prime numbers
		for (long i = 1; i <= limit; i++) { // i runs between 1 and the limit 
			long sqr_root = (long) Math.sqrt(i); // check if divisible up to its square root

			boolean is_Prime = true; //is_Prime function

			for (long j = 2; j <= sqr_root; j++) {

				if (i % j == 0) { // no remainder - not prime 

					is_Prime = false; // Current is not prime.
					break; //adding the break significantly reduces the time
				} 
			}

			if (is_Prime) { 
				System.out.println(i); //prlong out prime numbers
				totals++; //add to total number of prime numbers 

			} 
		}
		//Calculating and prlonging time taken
		long endTime = System.currentTimeMillis(); //times process
		long totalTime = endTime - startTime; 
		long timeSeconds = totalTime/1000;
		System.out.println("There are a total of "+totals+" prime numbers between 1 and "+ limit);
		System.out.println("This programme took " + totalTime + " ms to run");
		System.out.println("Which is approximately " + timeSeconds + " s to run");

	}
}