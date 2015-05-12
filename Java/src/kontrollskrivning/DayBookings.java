package kontrollskrivning;

import java.util.Arrays;

public class DayBookings {
	
	private String room;
	private String day;
	private boolean hours[] = new boolean[24];
	
	/** Skapar ett objekt som h책ller reda p책 vilka tider som salen room 채r
	bokade under dagen day. Fr책n b쉜jan 채r inga tider bokade */
	public DayBookings(String room, String day) {
		this.room = room;
		this.day = day;
		Arrays.fill(hours, false);
	}
	
	/** Tar reda p책 salen */
	String getRoom() { return room; }
	/** Tar reda p책 dagen */
	String getDay() { return day; }
	
	/** Returnerar true om salen 채r bokad under timmen hour, false annars */
	boolean isBooked(int hour) { return hours[hour];	}
	
	/** Unders쉓er f쉜st om salen 채r ledig under alla timmarna start..finish.
	I s책 fall bokas alla timmarna och returneras true. I annat fall
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
