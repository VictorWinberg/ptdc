package inl1;

import java.awt.Color;
import java.util.Scanner;
import se.lth.cs.window.SimpleWindow;

public class TurtleRace {

	/** Skapar sköldpaddorna, kapplöpningsbanan och ett lopp, genomför loppet */
	public static void main(String[] args) {
		int wsize = 800; // Detta sätter fönsterts storlek både i x- och y-led
		int le = (int) (wsize * 0.025); // Detta är vad som klassas som en
										// längdenhet i fönstret
		Scanner s = new Scanner(System.in);
		System.out.println("Skriv antalet sköldpaddor (maximalt 10)");
		int n = s.nextInt();
		SimpleWindow w = new SimpleWindow(wsize, wsize, "TurtleRace");
		Turtles turtles = new Turtles(w, n, le);
		RaceTrack track = new RaceTrack(le * 34, le * 5);
		RacingEvent race = new RacingEvent(track, turtles.getTurtles());
		new Checkers(w, 1, le, Color.BLACK);
		new Checkers(w, 17, le, Color.BLACK);
		new Marking(w, le);
		new GameStart(w, "Click to start race!");
		new RaceLight(w, wsize / 15);
		race.startRace(w);
		new Finish(w, le);
		s.close();
	}
}