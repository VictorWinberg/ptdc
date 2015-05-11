package kontrollskrivning;

import java.util.Scanner;

public class TestBook {

		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DayBookings d = null;
		while(true) {
			String set = s.next();
			if(set == "Room") {
				System.out.println("Room");
				String room = s.next();
				System.out.println("Day");
				String day = s.next();
				d = new DayBookings(room, day);
				System.out.println("Your room is " + d.getRoom() + " on day " + d.getDay());
			}
			else if(set == "Book") {
				System.out.println("Book start and finish");
				int start = s.nextInt();
				int finish = s.nextInt();
				boolean booked = d.book(start, finish);
				System.out.println(booked ? "Your booking are done" : "Cannot book that time");
			}
			else break;
		}
		s.close();
	}
}