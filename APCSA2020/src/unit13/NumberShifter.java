package unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		Random rand = new Random();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = rand.nextInt(10)+1;
		}
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		for(int i = 1; i < array.length; i++) {
			if(array[i]==7) {
				for(int j = 0; j < i; j++) {
					if(array[j]!=7) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
						break;
					} 
				}
			}
		}
	}
}