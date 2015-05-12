package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Square extends Shape {

	private int size;
	
	protected Square(int x, int y, int size) {
		super(x, y);
		this.size = size;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x + size, y);
		w.lineTo(x + size, y + size);
		w.lineTo(x, y + size);
		w.lineTo(x, y);
	}

	public boolean near(int xc, int yc) {
		int radius = size / 2;
		return Math.abs(x + radius - xc) < radius && Math.abs(y + radius - yc) < radius;
	}
}
