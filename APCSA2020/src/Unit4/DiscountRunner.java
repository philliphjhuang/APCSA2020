package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		Discount dc = new Discount();
		for(int i = 0; i < 5; i++) {
			out.print("Enter the original bill amount :: ");
			double amt = keyboard.nextDouble();
			out.println(String.format("Bill after discount :: %.2f\n",dc.getDiscountedBill(amt)));
		}
	}
}
/*----------------------result-------------------------
Enter the original bill amount :: 500
Bill after discount :: 500.00

Enter the original bill amount :: 2500
Bill after discount :: 2125.00

Enter the original bill amount :: 4000
Bill after discount :: 3400.00

Enter the original bill amount :: 333.333
Bill after discount :: 333.33

Enter the original bill amount :: 95874.2154
Bill after discount :: 81493.08

*/