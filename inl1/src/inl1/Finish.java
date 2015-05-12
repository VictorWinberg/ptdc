package inl1;
import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

public class Finish {

	/** Skapar flera Checkers-objekt i rött och svart för att f√• en disko-effekt. */
	public Finish(SimpleWindow w, int le) {
		while (true) {
			new Checkers(w, 1, le, Color.BLACK);
			new Checkers(w, 17, le, Color.BLACK);
			SimpleWindow.delay(100);
			new Checkers(w, 1, le, Color.RED);
			new Checkers(w, 17, le, Color.RED);
			SimpleWindow.delay(100);
		}
	}
}
