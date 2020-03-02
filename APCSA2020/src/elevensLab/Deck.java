package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
	public Deck() {
		
		//refer cards to new ArrayList
		cards = new ArrayList<Card>();
		
		//set top to the top of the deck 51
		top = 51;
		
		//loop through all suits
		for(int i = 0; i < SUITS.length; i++) {
			//loop through all faces 1 to 13
			for(int j = 1; j <= 13; j++) {
   			//add a new TwentyOneCard to the deck
				cards.add(new Card(SUITS[i],j));
			}
		}
	}
	
   //make a dealCard() method that returns the top card
   public Card dealCard() {
	   return cards.get(top);
   }
   
   //write a shuffle() method
   public void shuffle() {
	   
   	   //use Colletions.shuffle
	   Collections.shuffle(cards);
	   
       //reset the top card 
	   top = 51;
	   
   }
}
