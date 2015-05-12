package lab5;

import java.awt.Color;
import lab4.Turtle;
import se.lth.cs.window.SimpleWindow;

public class ColorTurtle extends Turtle {
	private Color color;

	public ColorTurtle(SimpleWindow w, int x, int y, Color color) {
		super(w, x, y);
		this.color = color;
	}

	public void forward(int n) {
		Color savedColor = w.getLineColor();
		w.setLineColor(color);
		super.forward(n);
		w.setLineColor(savedColor);
	}

	public void setColor(Color color) {
		this.color = color;
	}
}