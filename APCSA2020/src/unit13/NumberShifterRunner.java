package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter ns = new NumberShifter();
		//add test cases
		int[] array1 = ns.makeLucky7Array(10);
		System.out.println(Arrays.toString(array1));
		ns.shiftEm(array1);
		System.out.println(Arrays.toString(array1));
		
		int[] array2 = ns.makeLucky7Array(11);
		System.out.println("\n\n" + Arrays.toString(array2));
		ns.shiftEm(array2);
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = ns.makeLucky7Array(12);
		System.out.println("\n\n" + Arrays.toString(array3));
		ns.shiftEm(array3);
		System.out.println(Arrays.toString(array3));
	} 
}



