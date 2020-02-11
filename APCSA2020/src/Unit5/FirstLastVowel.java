package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Phillip Huang
//Date - 02/11/2020


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = a.substring(0,1);
	   String last = a.substring(a.length()-1);
	   String ans;
	   if("a".equalsIgnoreCase(first)||"e".equalsIgnoreCase(first)||"i".equalsIgnoreCase(first)||"o".equalsIgnoreCase(first)||"u".equalsIgnoreCase(first)||"a".equalsIgnoreCase(last)||"e".equalsIgnoreCase(last)||"i".equalsIgnoreCase(last)||"o".equalsIgnoreCase(last)||"u".equalsIgnoreCase(last)) {
		   ans = "yes";
	   } else {
		   ans = "no";
	   }
	   return ans;
	}
}