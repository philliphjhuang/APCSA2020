package Unit0;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Phillip Huang
//Date - 01/31/2020
//Class - APCSA Period 2
//Lab  -

import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.print("\nEnter a double :: ");
		doubleOne = keyboard.nextInt();
		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextInt();
		
		System.out.print("\nEnter a float :: ");
		floatOne = keyboard.nextInt();
		
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextInt();
		
		System.out.print("\nEnter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		//add in input for all variables

		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		
		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		//add in output for all variables


	}
}