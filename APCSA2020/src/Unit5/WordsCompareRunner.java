package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare wc = new WordsCompare();
	   
	   wc.setWords("abe", "ape");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("giraffe", "gorilla");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("one", "two");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("fun", "funny");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("123", "19");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("193", "1910");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("goofy", "godfather");
	   wc.compare();
	   System.out.println(wc.toString());
	   wc.setWords("funnel", "fun");
	   wc.compare();
	   System.out.println(wc.toString());
	   //add test cases
	}
}
/*----------------------------result--------------------------
abe should be placed before ape

giraffe should be placed before gorilla

one should be placed before two

fun should be placed before funny

123 should be placed before 19

193 should be placed after 1910

goofy should be placed after godfather

funnel should be placed after fun

*/