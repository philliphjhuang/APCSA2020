package Unit2;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Phillip Huang
//Date - 02/03/2020

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double slope = ((double)y2-(double)y1)/((double)x2-(double)x1);
		return slope;
	}

}