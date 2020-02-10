package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if(a > b) {
			return Math.round((a - b) * 10) / 10.0;
		} else if(a < b) {
			return Math.round((b - a) * 10) / 10.0;
		} else if(a == b) {
			return a * b;
		}
		return 0;
	}
}