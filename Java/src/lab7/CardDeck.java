package lab7;

import se.lth.cs.ptdc.cardGames.Card;
import java.util.Random;

/**
 * En kortlek med Card-objekt.
 * OBSERVERA: bara skelett, du ska sj채lv skriva denna klass.
 */
public class CardDeck {
	
	private Card[] cards; // korten
	private int current = 0; // index f쉜 "n채sta" kort
	private static Random rand = new Random();
	
	/**
	 * Skapar en kortlek som inte 채r blandad.
	 */
	public CardDeck() {
		cards = new Card[52]; // skapa vektorn
		// skapa korten, l채gg in dem i vektorn
		for(int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
			for(int rank = 1; rank <= 13; rank++) {
				cards[current] = new Card(suit, rank);
				current++;
			}
		}
		current = 0;
	}

	/**
	 * Blandar kortleken.
	 */
	public void shuffle() {
		for(int i = 51; i > 0; i--) {
			int nbr = rand.nextInt(i+1);
			Card tempCard = cards[nbr];
			cards[nbr] = cards[i];
			cards[i] = tempCard;
		}
		current = 0;
	}

	/**
	 * Unders쉓er om det finns fler kort i kortleken.
	 * 
	 * @return true om det finns fler kort, false annars
	 */
	public boolean moreCards() {
		return current < 52;
	}

	/**
	 * Drar det 쉡ersta kortet i leken. Fungerar bara om moreCards 채r true.
	 * 
	 * @return det 쉡ersta kortet i leken
	 */
	public Card getCard() {
		if(moreCards()) {
			current++;
			return cards[current-1];
		}
		return null;
	}
}
