package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
	}

	public double getBiggest()
	{
		double max = 0;
		for(int i = 0; i < 3; i++) {
			if(one>=two) {
				if(one>=three) {
					if(one>=four) {
						max = one;
					}else {
						max = four;
					}
				} else if(three>=four) {
					max = three;
				}
			} else if(two>=three) {
				if(two>=four) {
					max = two;
				} else {
					max = four;
				}
			} else if(four>=three) {
				if(four>=two) {
					max = four;
				} else {
					max = two;
				}
			}
		}
		
		
		return max;
	}

	public String toString()
	{
	   return one+" "+two+" "+three+" "+four;
	}
}