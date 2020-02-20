package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run1 = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run1.toString());
		System.out.println("biggest = " + run1.getBiggest() + "\n");
		
		BiggestDouble run2 = new BiggestDouble(14.51,6.17,71.8,1.0);
		System.out.println(run2.toString());
		System.out.println("biggest = " + run2.getBiggest() + "\n");
		
		BiggestDouble run3 = new BiggestDouble(41.15,816.7,17.8,19.0);
		System.out.println(run3.toString());
		System.out.println("biggest = " + run3.getBiggest() + "\n");
		
		BiggestDouble run4 = new BiggestDouble(884.5,16.7,7.8,9.0);
		System.out.println(run4.toString());
		System.out.println("biggest = " + run4.getBiggest() + "\n");
		
		BiggestDouble run5 = new BiggestDouble(4.5,-456.7,677.8,9.0);
		System.out.println(run5.toString());
		System.out.println("biggest = " + run5.getBiggest() + "\n");
		
		BiggestDouble run6 = new BiggestDouble(4.5,16.7,-7.8,-9.0);
		System.out.println(run6.toString());
		System.out.println("biggest = " + run6.getBiggest() + "\n");
		//add more test cases
				
	}
}
/*---------------------------------result--------------------------------------
4.5 6.7 7.8 9.0
biggest = 9.0

14.51 6.17 71.8 1.0
biggest = 71.8

41.15 816.7 17.8 19.0
biggest = 816.7

884.5 16.7 7.8 9.0
biggest = 884.5

4.5 -456.7 677.8 9.0
biggest = 677.8

4.5 16.7 -7.8 -9.0
biggest = 16.7

*/