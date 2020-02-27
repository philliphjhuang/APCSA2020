package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
	
	private String suit;
	private String rank;
	
	private int face;
  	//constructors
	public Card() {
		
	}

	// modifiers
		//set methods
	public void setFace(int f) {
		face = f;
	}

  	//accessors
		//get methods
	public String getCard(int f) {
		return suit;
	}

  	//toString
	public String toString() {
		return "";
	}
 }