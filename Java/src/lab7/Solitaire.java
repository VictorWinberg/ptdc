package lab7;

import se.lth.cs.ptdc.cardGames.Card;

public class Solitaire {

	public static void main(String[] args) {
		int fail = 0;
		int tot = 0;
		CardDeck deck = new CardDeck();
		while (true) {
			deck.shuffle();
			int nbr = 1;
			while (deck.moreCards()) {
				Card c = deck.getCard();
				if (nbr == c.getRank()) {
					fail++;
					break;
				}
				switch (nbr) {
				case 1:	case 2: nbr++;
					break;
				case 3: nbr = 1;
					break;
				}
			}
			tot++;
			System.out.println((double) (tot - fail) / tot);
		}
	}
}