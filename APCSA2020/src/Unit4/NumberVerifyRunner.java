package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter a whole number :: ");
			int x = keyboard.nextInt();
			System.out.println(x + " is odd :: " + NumberVerify.isOdd(x));
			System.out.println(x + " is even :: " + NumberVerify.isEven(x));
			System.out.println("");
		//add in more test cases
		}
	}
}
/*-------------------result-------------------
Enter a whole number :: 111
111 is odd :: true
111 is even :: false

Enter a whole number :: 2000
2000 is odd :: false
2000 is even :: true

Enter a whole number :: -99
-99 is odd :: true
-99 is even :: false

Enter a whole number :: 1111
1111 is odd :: true
1111 is even :: false

Enter a whole number :: -850
-850 is odd :: false
-850 is even :: true

*/