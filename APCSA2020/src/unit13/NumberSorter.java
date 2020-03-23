package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown
	private static int getNumDigits(int number)
	{
		int count = 0;
		if(number==0) {
			return 1;
		}
		while(number!=0) {
			number/=10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int temp = number;
		int index = 0;
		do {
			sorted[index] = temp%10;
			temp /= 10;
			index++;
		} while(temp!=0);
		
		for(int i = 0 ; i < sorted.length - 1; i++) {
			for(int j = i + 1; j < sorted.length; j++) {
				if(sorted[i]>sorted[j]) {
					int tem = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = tem;
				}
			}
		}
		return sorted;
	}
}