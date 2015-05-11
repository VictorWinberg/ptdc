package lab5;

import java.awt.Color;
import java.util.Random;

import se.lth.cs.window.SimpleWindow;

public class TwoRandomWalk {

	public static void main(String[] args) {
		Random r = new Random();
		SimpleWindow w = new SimpleWindow(600, 600, "RandomWalk");
		ColorTurtle t1 = new ColorTurtle(w, 250, 250, Color.BLUE);
		ColorTurtle t2 = new ColorTurtle(w, 350, 350, Color.RED);
		t1.penDown();
		t2.penDown();
		int dist = 100;
		while (dist >= 50) {
			t1.forward(r.nextInt(10) + 1);
			t1.left(r.nextInt(360) - 180);
			t2.forward(r.nextInt(10) + 1);
			t2.left(r.nextInt(360) - 180);
			SimpleWindow.delay(10);
			dist = (int) Math.hypot(t1.getX() - t2.getX(), t1.getY() - t2.getY());
		}
	}
}