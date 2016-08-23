import java.math.BigInteger;
public class TaskSeven {
public static void main(String[] args)
{
long startTime = System.currentTimeMillis();
//BigInteger sum = new BigInteger("2"); //what is a big integer
boolean isPrime = true;
long limit = 3000000000L;
for (int i=3; i< limit ; i++)
{
double aa = Math.sqrt((double)i);
for (int j=2; j<=aa; j++)
{
if (i % j == 0)
{
isPrime = false;
break;
}
}
if(isPrime)
{
System.out.println(BigInteger.valueOf(i));
}
isPrime = true;
}
long endTime = System.currentTimeMillis();
long totalTime = endTime - startTime; 
long timeSeconds = totalTime/1000;

System.out.println("This programme took " + totalTime + " ms to run");
System.out.println("Which is approximately " + timeSeconds + " s to run");
}

}