package kontrollskrivning;

import java.util.Arrays;

public class DayBookings {
	
	private String room;
	private String day;
	private boolean hours[] = new boolean[24];
	
	/** Skapar ett objekt som h�ller reda p� vilka tider som salen room är
	bokade under dagen day. Fr�n b�rjan är inga tider bokade */
	public DayBookings(String room, String day) {
		this.room = room;
		this.day = day;
		Arrays.fill(hours, false);
	}
	
	/** Tar reda p� salen */
	String getRoom() { return room; }
	/** Tar reda p� dagen */
	String getDay() { return day; }
	
	/** Returnerar true om salen är bokad under timmen hour, false annars */
	boolean isBooked(int hour) { return hours[hour];	}
	
	/** Unders�ker f�rst om salen är ledig under alla timmarna start..finish.
	I s� fall bokas alla timmarna och returneras true. I annat fall
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
