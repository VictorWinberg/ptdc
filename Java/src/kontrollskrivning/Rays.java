package kontrollskrivning;
import se.lth.cs.window.SimpleWindow;

public class Rays {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(200, 200, "Rays");
		int n = 100;
		int radius = 80;
		while(n > 0) {
			w.moveTo(100, 100);
			double degree = (Math.random()*361);
			double radDegree = Math.toRadians(degree);
			int dx = (int) (Math.cos(radDegree) * radius);
			int dy = (int) (Math.sin(radDegree) * radius);
			w.lineTo(w.getX() + dx, w.getY() + dy);
			n--;
		}
	}
}
