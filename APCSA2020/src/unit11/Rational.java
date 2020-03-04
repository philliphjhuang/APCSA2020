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
		int divideBy = -1; 
		int max = Math.max(x, y);
		for(int i = 1; i < max; i ++) {
			if (((double)x % i) == 0 && ((double)y % i) == 0) {
				divideBy = 1;
			}
		}
		if (divideBy != -1) {
			num = x/divideBy;
			den = y/divideBy;
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
		num = num * other.getDenominator() + other.getNumerator() * den;
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		den = den * other.getDenominator();
		reduce();
	}

	private void reduce()
	{
		int divideBy = -1; 
		int max = 100;
		for(int i = 1; i < max; i ++) {
			if (((double)num % i) == 0 && ((double)den % i) == 0) {
				divideBy = i;
			}
		}
		if (divideBy != -1) {
			num = num / divideBy;
			den = den / divideBy;
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne, numTwo);
		for(int x = min; x > 1; x --) {
			if (numOne % x == 0 && numTwo % x == 0) {
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
		if((double)num/den==(double)((Rational) obj).getNumerator()/((Rational)obj).getDenominator()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if((double)num / den > (double)other.getNumerator()/other.getDenominator()){
			return 1;
		}
		return -1;
	}
	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
}