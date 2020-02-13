package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word w = new Word();
		w.setString("Hello");
		System.out.print(w.toString());
		
		w.setString("World");
		System.out.print(w.toString());
		
		w.setString("JukeBox");
		System.out.print(w.toString());
		
		w.setString("TCEA");
		System.out.print(w.toString());
		
		w.setString("UIL");
		System.out.print(w.toString());
		
		//add test cases		
	}
}
/*-----------------------------------------result-------------------------------------------
H
o
olleH
Hello


W
d
dlroW
World


J
x
xoBekuJ
JukeBox


T
A
AECT
TCEA


U
L
LIU
UIL


*/