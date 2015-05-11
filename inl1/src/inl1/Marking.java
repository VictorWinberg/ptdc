package inl1;

import se.lth.cs.window.SimpleWindow;

public class Marking {

	/** Skriver ut 100 meters-markeringar i fönstrets marginal */
	public Marking(SimpleWindow w, int le) {
		for (int i = 0; i < 28; i++) {
			w.moveTo(2 * le, (i + 6) * le);
			if (i % 4 == 0) {
				w.lineTo((int) (3.5 * le), (i + 6) * le);
				w.writeText(" " + (7 - i / 4) * 100 + " meters");
			} else
				w.lineTo((int) (2.5 * le), (i + 6) * le);
		}
	}
}
