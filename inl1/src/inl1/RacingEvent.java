package inl1;

import java.util.Random;
import lab5.ColorTurtle;
import se.lth.cs.window.SimpleWindow;

public class RacingEvent {

	private RaceTrack track;
	private ColorTurtle[] t;
	
	/** Skapar ett lopp mellan sköldpaddorna t på
	 * kapplöpningsbanan track */
	public RacingEvent(RaceTrack track, ColorTurtle[] t) {
		this.track = track;
		this.t = t;
	}
	/** Startar loppet, och skriver ut vinnaren vid slutet */
	public void startRace(SimpleWindow w) {
		track.draw(w);
		Random rand = new Random();
		Boolean finished = false;
		String text = "";
		while(true) {
			for(ColorTurtle t1 : t)
				t1.forward(rand.nextInt(3));
			// Check if tie
			for(int i = 0; i < t.length; i++) {
				if(t[i].getY() < track.getFinish()) {
					finished = true;
					text += (i+1) + " ";
				}
			}
			if(finished) {
				w.moveTo(w.getWidth()/2 - 40, w.getHeight() / 2);
				w.writeText("Turtle " + text + "won!");
				return;
			}
			SimpleWindow.delay(10);
		}
	}
}
