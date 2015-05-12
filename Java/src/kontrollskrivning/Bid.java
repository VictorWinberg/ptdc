package kontrollskrivning;

public class Bid {
	
	private int houseId;
	private int amount;
	private Customer bidder;
	
	/** Skapar ett budobjekt. Budet g채ller stugan med nummer houseId, 채r p책
	amount kronor och 채r lagt av kunden bidder */
	public Bid(int houseId, int amount, Customer bidder) {
		this.houseId = houseId;
		this.amount = amount;
		this.bidder = bidder;
	}
	
	/** Tar reda p책 stugans idnummer */
	int getId() { return houseId; }
	
	/** Tar reda p책 budets storlek (i kronor) */
	int getAmount() { return amount; }
	
	/** Tar reda p책 kunden som lagt detta bud */
	Customer getBidder() { return bidder; }
	
	/** Returnerar skillnaden mellan detta bud och budet b (i kronor). Resultatet
	ska bli ett positivt tal om detta bud 채r h쉍re 채n budet b */
	int getDifference(Bid b) { return this.amount - b.amount; }
}
