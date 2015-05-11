package lab3;

import java.awt.Color;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class MoveSquare {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "MoveSquare");
		Square sq = new Square(0, 0, 50);

		while (true) {
			w.waitForEvent();
			if (w.getEventType() == SimpleWindow.MOUSE_EVENT) {
				int dx = w.getMouseX() - sq.getX();
				int dy = w.getMouseY() - sq.getY();
				sq.erase(w);
				sq.move(dx, dy);
				sq.draw(w);
			} else if (w.getKey() == 'r' || w.getKey() == 'R') {
				w.setLineColor(Color.RED);
			} else {
				w.setLineColor(Color.BLACK);
			}
		}
	}
}