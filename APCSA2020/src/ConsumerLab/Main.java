package ConsumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		String pos = "src/ConsumerLab/positiveAdjectives.txt";
		String neg = "src/ConsumerLab/negativeAdjectives.txt";
		String sr = "src/ConsumerLab/simpleReview.txt";
		String wr = "src/ConsumerLab/26WestReview.txt";
		
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		
		try {
			Scanner input = new Scanner(new File("src/ConsumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);
				System.out.println("The file contains the text " + temp);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
		

		System.out.printf("\n\nTotal sentiment: %.2f", Review.totalSentiment(sr));
		System.out.println("\nStar rating: " + Review.starRating(sr));
		System.out.println("Fake Review: " + Review.fakeReview(sr));
		System.out.println("Negative Review: " + Review.moreNegativeReview(sr));
		System.out.println("Positive Review: " + Review.morePositiveReview(sr));
		
	}
}
/*---------------------------------------result-----------------------------------------
goods
The file contains the text goods
great
The file contains the text great
nice
The file contains the text nice
perfectly
The file contains the text perfectly
awesome
The file contains the text awesome


Total sentiment: -1.94
Star rating: 0
Fake Review: I wonder why Jojo's Bizarre is so goods even though some characters are great in the fights. Cody should also watch this awesome anime! 
Negative Review: I wonder why Jojo's Bizarre is so stupid even though some characters are weird in the fights. Cody should also watch this awful anime! 
Positive Review: I wonder why Jojo's Bizarre is so great even though some characters are goods in the fights. Cody should also watch this awesome anime! 

*/
