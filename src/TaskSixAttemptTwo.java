
public class TaskSixAttemptTwo {

   public static void main (String[] args)
   {	
	   long startTime = System.currentTimeMillis();	
       int i =0;
       int num =0;
       long limit = 10000; //highest so far
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= limit; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + "\n" + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to " + limit + " are :");
       System.out.print(primeNumbers);
       long endTime   = System.currentTimeMillis();
       long totalTime = endTime - startTime;
       long timeSeconds = totalTime/1000;
       System.out.println("\n This programme took " + totalTime + " ms to run \n");
       System.out.println("Which is approximately " + timeSeconds + " s to run");
   }
   
}