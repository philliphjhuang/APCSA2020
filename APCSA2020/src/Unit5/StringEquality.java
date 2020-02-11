package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
	}

	public StringEquality(String one, String two)
	{
	}

	public void setWords(String one, String two)
	{
		wordOne=one;
		wordTwo=two;
	}

	public boolean checkEquality( )
	{
		if(wordOne.equals(wordTwo)) {
			System.out.println(print());
			return true;
		}
		System.out.println(toString());
		return false;
	}

	public String toString()
	{
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
	public String print() {
		return wordOne + " has the same letters as " + wordTwo + "\n";
	}
}