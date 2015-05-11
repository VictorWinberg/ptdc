package övn;

import se.lth.cs.window.SimpleWindow;

public class Schack {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Schack");
		for (int i = 0; i < 2; i++) {
			int n = 50 - 48 * i;
			w.setLineWidth(n);
			for (int x = 0; x < w.getWidth() / n; x++) {
				for (int y = 0; y < w.getHeight() / n; y++) {
					if (x % 2 == 0 && (y + 1) % 2 == 0 || (x + 1) % 2 == 0
							&& y % 2 == 0) {
						w.moveTo(x * n, (int) ((y + 0.5) * n));
						w.lineTo((x + 1) * n, (int) ((y + 0.5) * n));
					}
				}
			}
		}
	}
}
