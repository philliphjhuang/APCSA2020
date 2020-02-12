package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private boolean perfect;
	//add constructors
   	public Perfect() {
   		
   	}
	//add a set method
   	public void getNum(int n) {
		number = n;
   	}
   	
	public boolean isPerfect()
	{
		int x = 0;
		for(int i = 1; i < number; i++) {
			if(number%i==0) {
				x+=i;
			}
		}
		if(number==x) {
			perfect = true;
		} else {
			perfect = false;
		}
		return perfect;
	}

	//add a toString	
	public String toString() {
		if(perfect==true) {
			return number + " is perfect.";
		} 
		return number + " is not perfect.";
	}
}