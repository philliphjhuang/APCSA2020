package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		TriangleWord tw = new TriangleWord();
		Scanner keyboard = new Scanner(System.in);
		String yesOrNo = "y";
		
		while("y".equalsIgnoreCase(yesOrNo)) {
			System.out.print("Enter a word :: ");
			String word = keyboard.next();
			tw.printTriangle(word);
			
			System.out.print("\nDo you want to enter more sample input? ");
			yesOrNo = keyboard.next();
			System.out.print("\n");
		}
	}
}
/*------------------------------------result-------------------------------------
Enter a word :: a
a

Do you want to enter more sample input? y

Enter a word :: it
i
itit

Do you want to enter more sample input? y

Enter a word :: box
b
bobo
boxboxbox

Do you want to enter more sample input? y

Enter a word :: toad
t
toto
toatoatoa
toadtoadtoadtoad

Do you want to enter more sample input? y

Enter a word :: fishy
f
fifi
fisfisfis
fishfishfishfish
fishyfishyfishyfishyfishy

Do you want to enter more sample input? y

Enter a word :: dog
d
dodo
dogdogdog

Do you want to enter more sample input? n

*/