
public class TaskSix {
	public static void main(String[]
			args)
			{
		long startTime = System.currentTimeMillis();	
int limit = 3000000;
System.out.println("Prime numbers between 1 and " + limit);
for (int i=1; i < limit; i++){
	
	boolean isPrime=true; //isPrime function

	for (int j=2; j < i ; j++)	{	
	if (i % j == 0){ //remainder
		isPrime = false;
		break
	}
	}
	 if(isPrime)
         System.out.println(i + " ");	
}

long endTime   = System.currentTimeMillis();
long totalTime = endTime - startTime;
long timeSeconds = totalTime/1000;
System.out.println("This programme took " + totalTime + " ms to run");
System.out.println("Which is approximately " + timeSeconds + " s to run");

}
	
			}


//1st attempt 300000 = 11s
    
//remove all even
//remove all 5s
//remove all 3s
//sieve 