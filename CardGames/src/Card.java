
public class Card {
	
	public static enum VALUE {
	    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING 
	}
	
	public static enum SUIT {
	    SPADES, HEARTS, DIAMOND, CLUBS
	}
	
	private VALUE faceValue;
	private SUIT suit;
	
	public Card (SUIT suit, VALUE faceValue){
		this.faceValue = faceValue;
		this.suit = suit;
	}
	
	public String toString(){
		return this.suit.name() + " " + this.faceValue.name();
	}
}
