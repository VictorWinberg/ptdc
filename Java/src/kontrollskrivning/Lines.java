package kontrollskrivning;

import java.awt.Color;

import se.lth.cs.window.SimpleWindow;

public class Lines {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "Lines");
		int size = w.getWidth();
		while(true) {
			for(int i = 0; i < size; i++) {
				int x = (int)(Math.random() * 256);
				Color color = new Color(x, x, x);
				w.setLineColor(color);
				w.moveTo(i, i);
				w.lineTo(size - i, i);
				w.lineTo(size - i, size - i);
				w.lineTo(i, size - i);
				w.lineTo(i, i);
			}
			SimpleWindow.delay(100);
		}
	}
}
