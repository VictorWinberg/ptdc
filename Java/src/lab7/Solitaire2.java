package lab7;

import se.lth.cs.ptdc.cardGames.Card;
import se.lth.cs.ptdc.cardGames.CardDeck;

public class Solitaire2 {

	public static void main(String[] args) {
		int total = 0;
		int failed = 0;
		while(true) {
			int nbr = 1;
			CardDeck deck = new CardDeck();
			deck.shuffle();
			while (deck.moreCards()) {
				if (nbr > 3) {
					nbr = 1;
				}
				Card c = deck.getCard();
				if (c.getRank() == nbr) {
					failed++;
					break;
				} else {
					nbr++;
				}
			}
			total++;
			double ratio = ((double) (total - failed) / total);
			System.out.println(ratio);
		}
	}
}