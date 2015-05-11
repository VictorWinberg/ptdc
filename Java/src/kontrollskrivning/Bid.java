package kontrollskrivning;

public class Bid {
	
	private int houseId;
	private int amount;
	private Customer bidder;
	
	/** Skapar ett budobjekt. Budet gäller stugan med nummer houseId, är på
	amount kronor och är lagt av kunden bidder */
	public Bid(int houseId, int amount, Customer bidder) {
		this.houseId = houseId;
		this.amount = amount;
		this.bidder = bidder;
	}
	
	/** Tar reda på stugans idnummer */
	int getId() { return houseId; }
	
	/** Tar reda på budets storlek (i kronor) */
	int getAmount() { return amount; }
	
	/** Tar reda på kunden som lagt detta bud */
	Customer getBidder() { return bidder; }
	
	/** Returnerar skillnaden mellan detta bud och budet b (i kronor). Resultatet
	ska bli ett positivt tal om detta bud är högre än budet b */
	int getDifference(Bid b) { return this.amount - b.amount; }
}
