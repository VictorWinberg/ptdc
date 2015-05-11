package inl1;
import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

public class Checkers {

	/** Skapar ett schackmönster
	 * @param startY y-positionen schackmönstert startar */
	public Checkers(SimpleWindow w, int startY, int le, Color col) {
		for (int x = 1; x <= 36; x++) {
			for (int y = startY * 2; y < 2 * startY + 3; y++) {
				if (x % 2 == 0 && y % 2 == 0)
					Square(w, x * le, y * le, le, col);
				else if (x == 36)
					continue;
				else if (x % 2 == 0)
					Square(w, (x + 1) * le, y * le, le, col);
			}
		}
	}
	public void Square(SimpleWindow w, int x, int y, int size, Color col) {
		for (int i = 0; i < size; i++) {
			Color savedColor = w.getLineColor();
			w.setLineColor(col);
			w.moveTo(x, y + i);
			w.lineTo(x + size, y + i);
			w.setLineColor(savedColor);
		}
	}
}
