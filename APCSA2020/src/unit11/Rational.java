package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num1;
	int num2;
	//write two constructors
	public Rational() {
		
	}
	
	public Rational(int numOne,int numTwo) {
		num1 = numOne;
		num2 = numTwo;
	}
	
	//write a setRational method
	public void setRational() {
		
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int numOne) {
		num1 = numOne;
	}
	
	public void setDenominator(int numTwo) {
		num2 = numTwo;
	}
	
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne,numTwo);
		for(int x = min; x > 1; x--) {
			if(numOne%x==0 && numTwo==0) {
				return x;
			}
			return 1;
		}
		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return 1;
	}
	public int getDenominator() {
		return 1;
	}
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return "";
	}
	
}