package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		System.out.println(Review.sentimentVal("goods"));
		
		System.out.println(Review.totalSentiment("src/ConsumerLab/positiveAdjectives.txt"));
		
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
		String a = Review.textToString("src/ConsumerLab/positiveAdjectives.txt");
		System.out.println("textToString prints:: " + a);
	}
}