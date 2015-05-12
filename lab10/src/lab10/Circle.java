package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class Circle extends Shape {

	private int size;
	
	protected Circle(int x, int y, int size) {
		super(x, y);
		this.size = size;
	}

	public void draw(SimpleWindow w) {
		w.moveTo(x + size, y);
		int n = 300;
		double rad0 = (2 * Math.PI) / n;
		for(int i = 0; i <= n; i++) {
			double rad = rad0 * i;
			int newX = (int) Math.round(x + Math.cos(rad) * size);
			int newY = (int) Math.round(y + Math.sin(rad) * size);
			w.lineTo(newX, newY);
		}
	}
	
	public boolean near(int xc, int yc) {
		return Math.hypot(Math.abs(x - xc), Math.abs(y - yc)) < size;
	}
}
