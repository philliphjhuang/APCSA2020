package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality se = new StringEquality();
		//add test cases
		se.setWords("hello", "goodbye");
		se.checkEquality();
		se.setWords("one", "two");
		se.checkEquality();
		se.setWords("three", "four");
		se.checkEquality();
		se.setWords("TCEA", "UIL");
		se.checkEquality();
		se.setWords("State", "Champions");
		se.checkEquality();
		se.setWords("ABC", "ABC");
		se.checkEquality();
		se.setWords("ABC", "CBA");
		se.checkEquality();
		se.setWords("Same", "Same");
		se.checkEquality();
	}
}
/*---------------------------result---------------------------
hello does not have the same letters as goodbye

one does not have the same letters as two

three does not have the same letters as four

TCEA does not have the same letters as UIL

State does not have the same letters as Champions

ABC has the same letters as ABC

ABC does not have the same letters as CBA

Same has the same letters as Same

*/