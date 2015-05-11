package inl1;

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;
import lab5.ColorTurtle;

public class Turtles {

	private ColorTurtle[] t;
	/** Skapar n antal ColorTurtles
	 * @param n antalet ColorTurtles */
	public Turtles(SimpleWindow w, int n, int le) {
		this.t = new ColorTurtle[n];
		for (int i = 0; i < n; i++) {
			int R = (int) (Math.random() * 256);
			int G = (int) (Math.random() * 256);
			int B = (int) (Math.random() * 256);
			t[i] = new ColorTurtle(w, w.getWidth() / 2 + (3 * le) * ((i - n / 2) + 1),
					le * 34, new Color(R, G, B)); // Division med heltal retunerar int
			t[i].penDown();
			w.writeText("Turtle " + (i + 1));
		}
	}
	/** retunerar ColorTurtles t */
	public ColorTurtle[] getTurtles() { return t; }
}
