package kontrollskrivning;

public class SmallBidExample {
	public static void main(String[] args) {
		Bid b1 = new Bid(27, 200000, new Customer("Lisa Alm"));
		Bid b2 = new Bid(27, 200000, new Customer("Bo Ek"));
		int diff = b1.getDifference(b2);
		Bid highest;
		if (diff >= 0) {
			highest = b1;
		} else {
			highest = b2;
		}
		System.out.println("Högsta budet är " + highest.getAmount()
				+ " och budgivare är " + highest.getBidder().getName());
	}
}