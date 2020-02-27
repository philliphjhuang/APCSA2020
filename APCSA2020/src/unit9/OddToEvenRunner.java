package unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		Integer[] one = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(ListOddToEven.go(Arrays.asList(one)));
		Integer[] two = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(ListOddToEven.go(Arrays.asList(two)));
		Integer[] three = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(ListOddToEven.go(Arrays.asList(three)));
		Integer[] four = {32767,70,4,5,6,7};
		System.out.println(ListOddToEven.go(Arrays.asList(four)));
		Integer[] five = {2,7,11,21,5,7};
		System.out.println(ListOddToEven.go(Arrays.asList(five)));
		Integer[] six = {7,255,11,255,100,3,2};
		System.out.println(ListOddToEven.go(Arrays.asList(six)));
		Integer[] seven = {9,11,11,11,7,1000,3};
		System.out.println(ListOddToEven.go(Arrays.asList(seven)));
		Integer[] eight = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(ListOddToEven.go(Arrays.asList(eight)));
		Integer[] nine = {2,4,6,8,8};
		System.out.println(ListOddToEven.go(Arrays.asList(nine)));
	}
}
/*----------------------------------result---------------------------------
10
8
3
4
-1
6
5
9
-1

*/
