package kontrollskrivning;

import java.util.Arrays;

public class DayBookings {
	
	private String room;
	private String day;
	private boolean hours[] = new boolean[24];
	
	/** Skapar ett objekt som håller reda på vilka tider som salen room √§r
	bokade under dagen day. Från början √§r inga tider bokade */
	public DayBookings(String room, String day) {
		this.room = room;
		this.day = day;
		Arrays.fill(hours, false);
	}
	
	/** Tar reda på salen */
	String getRoom() { return room; }
	/** Tar reda på dagen */
	String getDay() { return day; }
	
	/** Returnerar true om salen √§r bokad under timmen hour, false annars */
	boolean isBooked(int hour) { return hours[hour];	}
	
	/** Undersöker först om salen √§r ledig under alla timmarna start..finish.
	I så fall bokas alla timmarna och returneras true. I annat fall
	bokas ingenting och returneras false */
	boolean book(int start, int finish) {
		for (int i = start; i < finish; i++) {
			if(hours[i]) return false;
		}
		for (int i = start; i < finish; i++) {
			hours[i] = true;
		}
		return true;
	}
}
