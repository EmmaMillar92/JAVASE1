import java.util.Scanner;
import java.text.DecimalFormat;

public class TaskFive {
	public static void main(String[] args) {


		int cmsize = 20;  // number of litres
		double cmprice = 19.99; //price of tin
		int cmcover = 10; //coverage per litre
		int ajsize = 15;
		double ajprice = 17.99;
		int ajcover = 11;
		int dpsize= 10;
		double dpprice = 25;
		int dpcover = 20;

		int a;	 
		Scanner in = new Scanner(System.in);

		System.out.println("Size of room in metres squared");
		a = in.nextInt();

		double cmtincover = cmsize*cmcover; //coverage per tin
		double ajtincover = ajsize*ajcover;
		double dptincover= dpsize*dpcover;


		double cmtins = a/cmtincover;  // change to round to highest
		double ajtins = a/ajtincover;
		double dptins = a/dptincover;

		/*
System.out.println("Tins of CheapoMax" + cmtins);
System.out.println("Tins of AverageJoes" + ajtins);
System.out.println("Tins of DuluxourousPaints" +dptins );
		 */

		double cmtinsr = Math.ceil(a/cmtincover);  // change to round to highest
		double ajtinsr = Math.ceil(a/ajtincover);
		double dptinsr = Math.ceil(a/dptincover);
		/*
System.out.println("Tins of CheapoMax: " + cmtinsr);
System.out.println("Tins of AverageJoes: " + ajtinsr);
System.out.println("Tins of DuluxourousPaint: " +dptinsr );
System.out.println("\n");
		 */

		double cmtinsc = cmtinsr * cmprice;
		double ajtinsc = ajtinsr * ajprice;
		double dptinsc = dptinsr * dpprice;
		/*
DecimalFormat f = new DecimalFormat("##.00");
System.out.println("Cost of CheapoMax £" + f.format(cmtinsc));
System.out.println("Cost of AverageJoes £" + f.format(ajtinsc));
System.out.println("Cost of DuluxourousPaint £" + f.format(dptinsc) );
// what is the cheapest?
		 */

		if (cmtinsc < ajtinsc) {
			if (cmtinsc < dptinsc){
				System.out.println("CheapoMax is the cheapest.");
			}
		}
		else if (ajtinsc < dptinsc){
			System.out.println("AverageJoes is the cheapest.");
		}
		else {
			System.out.println("DuluxourousPaint is the cheapest.");
		}

		double cmtinsw = cmtinsr - cmtins; // waste per tin
		//System.out.println(cmtinsw + "m3 waster per tin");
		double ajtinsw = ajtinsr - ajtins; // waste per tin
		//System.out.println(ajtinsw + "m3 waster per tin");
		double dptinsw = dptinsr - dptins; // waste per tin
		//System.out.println(dptinsw + "m3 waster per tin");




		// what about when cost of wastage is then same???

		if (cmtinsw < ajtinsw) {
			if (cmtinsw < dptinsw){
				System.out.println("CheapoMax wastes the least.");
			}
		}
		if (ajtinsw < dptinsw){
			System.out.println("AverageJoes wastes the least.");
		}
		else if (dptinsw > ajtinsw){
			System.out.println("DuluxourousPaint wastes the least."); //probably can remove this 
		}
		else {
			System.out.println("CheapoMax and DuluxourousPaint both waste the least.");
			System.out.println("Due to price, CheapoMax is the best choice.");
		}

	}
}
/*

Create a paint requirement wizard that will calculate which of the following three products, would be the cheapest to buy, for the room you are painting.  
Work out which one wastes the least.
Work out which is the best choice for any room.



1) CheapoMax (20Litre) £19.99
	This tin of paint will cover 10m2 per Litre

2) AverageJoes (15 Litre) £17.99
	This tin of paint will cover 11m2 per Litre

3) DuluxourousPaints (10 Litre) £25
This tin of paint will cover 20m2 per Litre


- cheapest to buy
-wastes the least
-best choice

input size of room in metre squared
how many tins of paint to cover room (rounded)
Hoq much is wasted?




price per litre

System.out.println("The price per litre of CheapoMax is "  + cmprice/cmcover);
System.out.println("The price per litre of AverageJoes is "  + ajprice/ajcover);
System.out.println("The price per litre of DuluxourousPaints is "  + dpprice/dpcover);

double cmlp = cmprice/cmcover; //price per litre
double ajlp = ajprice/ajcover;
double dplp = dpprice/dpcover;

double 

System.out.println(cmlp);

 */
