package Unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples {
	private int number;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		number = num;
	}

	public void setNum(int num) {
		number = num;
	}
	
	public int greatestCommonFactor(int a, int b, int c) {
		int max = 2;
		for(int i = 1; i < number; i++) {
			if((a%i) == 0&& (b%i)==0 && (c%i)==0) {
				max = i;
			}
		}
		return max;
	}

	public String toString() {
		String output = "";

		for (int a = 1; a < 66; a++) {
			for (int b = 4; b < number; b++) {
				for (int c = 1; c < number; c += 2) {
					if ((a * a + b * b) == c * c) {
						if (a % 2 != b % 2) {
							if (greatestCommonFactor(a, b, c) <= 1) {
								output = output + a + " " + b + " " + c + "\n";
							}
						}
					}
				}
			}
		}

		return output + "\n";
	}
}