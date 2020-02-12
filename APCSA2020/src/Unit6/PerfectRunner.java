package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect p = new Perfect();
		
		p.getNum(496);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(45);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(6);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(14);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(8128);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(1245);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(33);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(28);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(27);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		p.getNum(33550336);
		p.isPerfect();
		System.out.println(p.toString()+"\n");
		
		//add test cases
																
	}
}
/*----------------------------------result--------------------------------------
496 is perfect.

45 is not perfect.

6 is perfect.

14 is not perfect.

8128 is perfect.

1245 is not perfect.

33 is not perfect.

28 is perfect.

27 is not perfect.

33550336 is perfect.

*/