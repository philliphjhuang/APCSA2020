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
	private int size;
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
	
	public Deck(String[] ranks, String[] suits, int[] pointValues) {
		cards = new ArrayList<Card>();
		
		for (int s = 0; s <suits.length; s++ ) {
			for (int r = 0; r<ranks.length;r++) {
				cards.add(new Card(ranks[r],suits[s],pointValues[r]));
			}
		}
		
		size = cards.size();
		top = size-1;
		this.shuffle();
	}
	
   //make a dealCard() method that returns the top card
   public Card dealCard() {
	   Card topCard;
		if (!isEmpty()) {
			topCard = cards.get(top);
		} else {
			return new Card();
		}

		top--;
		size--;
		return topCard;
   }
   
   public boolean isEmpty() {
		return size() == 0;
	}
   
   public int size() {
		return size;
	}
   
   //write a shuffle() method
   public void shuffle() {
	   for (int k = size-1; k >= 1; k--) {
			int r = (int) (Math.random()*size);
			Card temp = cards.get(k);
			Card temp1 = cards.get(r);
			cards.set(k,temp1);
			cards.set(r, temp);
		}
   }
   public void resetTop() {
		size = cards.size();
		top = size - 1;
	}
	
	public String toString() {
		String word = "size = " + size + "\nUndealt cards: \n";
		for (int i = size -1; i >= 0 ; i--) {
			word = word + cards.get(i);
			if (i != 0) {
				word = word +", ";
			}
			if ((size - i)% 2 ==0) {
				word = word + "\n";
			}
		}
		word = word +"\n\nDealt cards: \n";
		for (int i = cards.size()-1 ; i>=size ; i--) {
			word = word + cards.get(i);
			if (i != size) {
				word = word + ", ";
			}
			if ((size - i)% 2 == 0){
				word = word +"\n";
			}
		}
		return word + "\n";
	}
}
