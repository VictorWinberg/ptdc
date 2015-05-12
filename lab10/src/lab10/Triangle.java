package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Triangle extends Shape {

	private int size;
	
	protected Triangle(int x, int y, int size) {
		super(x, y);
		this.size = size;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x, y);
		w.lineTo(x + size / 2, (int) (y - Math.round((Math.sqrt(3) / 2 * size))));
		w.lineTo(x + size, y);
		w.lineTo(x, y);
	}
	
	public boolean near(int xc, int yc) {
		int radius = size / 2;
		return Math.abs(x + radius - xc) < radius && Math.abs(y - Math.sqrt(2) * radius - yc) < Math.sqrt(2) * radius;
	}
}
