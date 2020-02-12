package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne to = new TriangleOne();
		
		to.setWord("hippo");
		to.print();
		System.out.println("\n");
		
		to.setWord("abcd");
		to.print();
		System.out.println("\n");
		
		to.setWord("it");
		to.print();
		System.out.println("\n");
		
		to.setWord("a");
		to.print();
		System.out.println("\n");
		
		to.setWord("chicken");
		to.print();
		System.out.println("\n");
		
		//add test cases		
	}
}
/*--------------------------result--------------------------
hippo
hipp
hip
hi
h


abcd
abc
ab
a


it
i


a


chicken
chicke
chick
chic
chi
ch
c
*/