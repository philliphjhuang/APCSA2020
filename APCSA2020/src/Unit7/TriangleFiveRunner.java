package Unit7;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive tf = new TriangleFive();
	   tf.setLetter('C');
	   tf.setAmount(4);
	   System.out.println(tf.toString());
	   tf.setLetter('A');
	   tf.setAmount(5);
	   System.out.println(tf.toString());
	   tf.setLetter('B');
	   tf.setAmount(7);
	   System.out.println(tf.toString());
	   tf.setLetter('X');
	   tf.setAmount(6);
	   System.out.println(tf.toString());
	   tf.setLetter('Z');
	   tf.setAmount(8);
	   System.out.println(tf.toString());
   }
}
/*---------------------------------------------result----------------------------------------
CCCC DDD EE F 
CCCC DDD EE 
CCCC DDD 
CCCC 

AAAAA BBBB CCC DD E 
AAAAA BBBB CCC DD 
AAAAA BBBB CCC 
AAAAA BBBB 
AAAAA 

BBBBBBB CCCCCC DDDDD EEEE FFF GG H 
BBBBBBB CCCCCC DDDDD EEEE FFF GG 
BBBBBBB CCCCCC DDDDD EEEE FFF 
BBBBBBB CCCCCC DDDDD EEEE 
BBBBBBB CCCCCC DDDDD 
BBBBBBB CCCCCC 
BBBBBBB 

XXXXXX YYYYY ZZZZ AAA BB C 
XXXXXX YYYYY ZZZZ AAA BB 
XXXXXX YYYYY ZZZZ AAA 
XXXXXX YYYYY ZZZZ 
XXXXXX YYYYY 
XXXXXX 

ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF G 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE FF 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD EEE 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC DDDD 
ZZZZZZZZ AAAAAAA BBBBBB CCCCC 
ZZZZZZZZ AAAAAAA BBBBBB 
ZZZZZZZZ AAAAAAA 
ZZZZZZZZ 

*/