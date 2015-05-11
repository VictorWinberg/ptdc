package inl1;

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

public class RaceLight {

	ColorCircle[] c = new ColorCircle[3];
	/** Nedräkning av kapplöpningsloppet med tre röda lampor sen grönt
	 * @param w SimpleWindow-fönstret
	 * @param radius lampornas (cirklarnas) radie */
	public RaceLight(SimpleWindow w, int radius) {
		for (int i = 0; i < 3; i++) {
			c[i] = new ColorCircle(w, w.getWidth() / 2 + (i - 1) * 2 * radius,
					w.getWidth() / 2, radius, Color.RED);
			c[i].draw();
			SimpleWindow.delay(1000);
		}
		for (ColorCircle c1 : c) {
			c1.setColor(Color.GREEN);
			c1.draw();
		}
		SimpleWindow.delay(500);
		for (ColorCircle c1 : c) {
			c1.erase();
		}
	}
}
