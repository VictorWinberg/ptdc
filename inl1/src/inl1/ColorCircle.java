package inl1;
import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

public class ColorCircle {
	protected SimpleWindow w;
	private int x, y, radius;
	private Color color;
	
	/** Beskriver en ifylld cirkel med färg.
	 * @param w SimpleWindowf�nstret som används
	 * @param x positionen i x-led
	 * @param y positionen i y-led
	 * @param radius cirkelns radie
	 * @param color cirkelns färg */
	public ColorCircle(SimpleWindow w, int x, int y, int radius, Color color) {
		this.w = w;
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	public void draw() {
		Color savedColor = w.getLineColor();
		w.setLineColor(color);
		drawit();
		w.setLineColor(savedColor);
	}
	public void erase() {
		Color savedColor = w.getLineColor();
		w.setLineColor(Color.WHITE);
		drawit();
		w.setLineColor(savedColor);
	}
	public void drawit() {
		for (int i = 0; i < radius * 2; i++) {
			double rad = Math.acos((double) (i - radius) / radius);
			int y0 = (int) (Math.round(Math.sin(rad) * radius));
			w.moveTo(x + i - radius, y + y0);
			w.lineTo(x + i - radius, y - y0);
		}
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
