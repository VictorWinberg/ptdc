package extra;

import java.util.Random;
import se.lth.cs.window.SimpleWindow;

public class Fractals {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Fractals by Victor");
		Random random = new Random();
		while(true) {
			w.waitForMouseClick();
			w.clear();
			w.moveTo(0, 500);
			for(int i = 0; i < 600; i++) {
				w.moveTo(w.getX() + 1, w.getY());
				w.lineTo(w.getX(), w.getY() + (int)(random.nextGaussian() * 15));
			}
		}
	}
}