package elevensLab;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name - 

public class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };

	// instance variables
	private String suit;
	private String rank;
	private int pointValue;
	private int face = -1;

	// constructors
	public Card() {
		suit = "SPADES";
		face = 1;
		rank = "ACE";
		pointValue = 1;
	}
	
	public Card(String s, int f) {
		suit = s;
		face = f;
	}
	
	public Card(String startSuit, String startRank, int startPointValue) {
		suit = startSuit;
		rank = startRank;
		pointValue = startPointValue;
	}
	
	// modifiers
	public void setSuit(String s) {
		suit = s;
	}

	public void setRank(String r) {
		rank = r;
	}

	public void setPointValue(int pv) {
		pointValue = pv;
	}

	public void setFace(int f) {
		face = f;
	}

	// accessors
	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

	public int getPointValue() {
		return pointValue;
	}

	public int getFace() {
		return face;
	}

	// toString
	public String toString() {
		if (rank != null) {
			return rank + " of " + suit + " (point value = " + pointValue + ")";
		} else if (face != -1) {
			return FACES[face] + " of " + suit;
		}
		return "";
	}
	public boolean matches(Card otherCard) {
		if (this.getSuit().equals(otherCard.getSuit())&&this.getRank().equals(otherCard.getRank())&&this.pointValue==(otherCard.pointValue)) {
			return true;
		} else if(this.getSuit().equals(otherCard.getSuit())&&this.getRank().equals(otherCard.getRank())&&this.face==(otherCard.face)) {
			return true;
		}
		
		return false;
	}
}
