package Unit7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive {
	private char letter;
	private int amount;

	public TriangleFive() {
	}

	public TriangleFive(char c, int amt) {
		letter = c;
		amount = amt;
	}

	public void setLetter(char c) {
		letter = c;
	}

	public void setAmount(int amt) {
		amount = amt;
	}

	public String toString() {
		String output = "";
		String output1 = "";
		char letter1 = letter;
		for (int i = amount; i > 0; i--) {
			int j = i;
			while (j > 0) {
				output = output + letter1;
				j--;
			}
			output += " ";
			if (letter1 != 90) {
				letter1++;
			} else {
				letter1 = 'A';
			}
		}
		output1 = output;
		int val = 2, change = 3;
		for (int i = amount; i > 0; i--) {
			output = output + "\n" + output1.substring(0, output1.length() - val);
			val += change;
			change += 1;
		}
		return output;
	}
}