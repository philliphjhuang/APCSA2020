package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	//add in second constructor
	
	public LetterRemover(String x) {
		
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while(cleaned.indexOf(lookFor)!=-1) {
			String x = Character.toString(lookFor);
			cleaned = cleaned.replace(x,"");
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}