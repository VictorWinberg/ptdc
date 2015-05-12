package lab7;

import se.lth.cs.ptdc.cardGames.Card;

public class CardExample {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		
		while (deck.moreCards()) {
			Card c = deck.getCard();
			String suitString = "";
			switch (c.getSuit()) {
			case Card.SPADES: suitString = "Spades";
				break;
			case Card.HEARTS: suitString = "Hearts";
				break;
			case Card.DIAMONDS: suitString = "Diamonds";
				break;
			case Card.CLUBS: suitString = "Clubs";
				break;
			}
			System.out.println(c.getRank() + " of " + suitString);
		}
	}
}
