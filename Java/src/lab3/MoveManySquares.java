package lab3;

import java.awt.Color;
import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class MoveManySquares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		SimpleWindow w = new SimpleWindow(600, 600, "MoveManySquares");
		Square sq = new Square(0, 0, 50);

		while (true) {
			w.waitForEvent();
			if (w.getEventType() == SimpleWindow.MOUSE_EVENT) {
				int dx = (w.getMouseX() - sq.getX()) / n;
				int dy = (w.getMouseY() - sq.getY()) / n;
				for (int i = 0; i < n; i++) {
					sq.move(dx, dy);
					sq.draw(w);
				}
			} else if (w.getKey() == 'r' || w.getKey() == 'R') {
				w.setLineColor(Color.RED);
			} else {
				w.setLineColor(Color.BLACK);
			}
		}
	}
}