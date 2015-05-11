package kontrollskrivning;

public class Customer {
	
	private String name;
	
	/** Skapar en kund med namnet name */
	public Customer (String name) { 
		this.name = name;
	}
	/** Tar reda på kundens namn */
	String getName() { return name; }
}
