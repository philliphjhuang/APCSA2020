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
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters()+"\n\n");
		
		lr.setRemover("ssssssssxssssesssssesss",'s');
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters()+"\n\n");
		
		lr.setRemover("qwertyqwertyqwerty",'a');
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters()+"\n\n");
		
		lr.setRemover("abababababa",'b');
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters()+"\n\n");
		
		lr.setRemover("abaababababa",'x');
		System.out.println(lr.toString());
		System.out.println(lr.removeLetters()+"\n\n");
		
		//add test cases		
		
	}
}
/*--------------------------------------result---------------------------------------------
I am Sam I am - letter to remove a
I m Sm I m


ssssssssxssssesssssesss - letter to remove s
xee


qwertyqwertyqwerty - letter to remove a
qwertyqwertyqwerty


abababababa - letter to remove b
aaaaaa


abaababababa - letter to remove x
abaababababa


*/