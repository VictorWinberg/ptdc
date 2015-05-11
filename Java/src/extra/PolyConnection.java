package extra;

import förel.Polygon;
import se.lth.cs.window.SimpleWindow;

public class PolyConnection {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "Polygon");
		int x0 = 300;
		int y0 = 300;
		int n = 4;
		int ch = 1;
		while(true) {
			w.clear();
			Polygon p = new Polygon();
			n += ch;
			if(n == 35) ch *= -1;
			else if(n == 4) ch *= -1;
			double rad0 = (2 * Math.PI) / n;
			for(int i = 0; i < n; i++) {
				double rad = rad0 * i;
				int x = x0 + (int) (Math.cos(rad) * 200);
				int y = y0 + (int) (Math.sin(rad) * 200);
				p.addVertex(x, y);
			}
			p.drawAll(w);
			SimpleWindow.delay(100);
		}
	}
}
