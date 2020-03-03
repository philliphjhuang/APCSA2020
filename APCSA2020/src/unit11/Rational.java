package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num;
	int den;
	//write two constructors
	public Rational() {
		num = 1;
		den = 1;
	}
	
	public Rational(int numOne,int numTwo) {
		num = numOne;
		den = numTwo;
	}
	
	//write a setRational method
	public void setRational(int x, int y) {
		int max = Math.max(x, y) - 1;
		int divide = -1;
		for(int i = 1; i < max; i++) {
			if(x % i == 0 && y % i == 0) {
				divide = i;
			}
		}
		if(divide!=-1) {
			num = x/divide;
			den = y/divide;
		}
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int numerator) {
		num = numerator;
	}
	
	public void setDenominator(int denominator) {
		den = denominator;
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
		}
		return 1;
	}

	public Object clone()
	{
		return new Rational(this.getNumerator(), this.getDenominator());
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return den;
	}
	
	
	public boolean equals( Object obj)
	{
		if((double)num/den == (double)((Rational) obj).getNumerator()/((Rational) obj).getNumerator()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
}