package lab5;

import java.awt.Color;
import java.util.Random;

import se.lth.cs.window.SimpleWindow;

public class RandomWalk {

	public static void main(String[] args) {
		Random r = new Random();
		SimpleWindow w = new SimpleWindow(800, 800, "RandomWalk");
		int steps = 0;
		ColorTurtle t = new ColorTurtle(w, w.getWidth() / 2, w.getHeight() / 2, Color.BLUE);
		t.penDown();
		while (steps <= 1000) {
			t.forward(r.nextInt(10) + 1);
			t.left(r.nextInt(360) - 180);
			SimpleWindow.delay(1);
			steps++;
		}
	}
}