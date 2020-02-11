package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover lr = new LetterRemover();
		lr.setRemover("I am Sam I am",'a');
		lr.setRemover("ssssssssxssssesssssesss",'s');
		lr.setRemover("qwertyqwertyqwerty",'a');
		lr.setRemover("abababababa",'b');
		lr.setRemover("abaababababa",'x');
		//add test cases		
		
	}
}