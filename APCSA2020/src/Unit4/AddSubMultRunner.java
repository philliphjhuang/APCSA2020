package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMultRunner
{
	public static void main( String args[] )
	{
		System.out.println( AddSubMult.check( 10, 20) );		
		System.out.println( AddSubMult.check( 20, 10) );	
		System.out.println( AddSubMult.check( 20, 20) );
		System.out.println( AddSubMult.check( 10, 10) );	
		System.out.println( AddSubMult.check( 0, 1) );	
		System.out.println( AddSubMult.check( 1, 0 ) );	
		System.out.println( AddSubMult.check( 3.1, 5.7) );	
		System.out.println( AddSubMult.check( 5.2, 3.8 ) );	
		System.out.println( AddSubMult.check( 5342, 323 ) );						
	}
}
/*-------------------results----------------------------
10.0
10.0
400.0
100.0
1.0
1.0
2.6
1.4
5019.0
*/
