package övn;

import java.awt.Color;

import se.lth.cs.window.SimpleWindow;

public class BouncyBall {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "Schack");
		w.setLineWidth(4);
		w.setLineColor(Color.RED);
		int x = 10;
		int y = 50;
		int dx = 20;
		int dy = -2;
		w.moveTo(x, y);
		while(true) {
			if(x >= w.getWidth()) dx *= -1;
			else if(y >= w.getHeight()) dy *= -1;
			else if(x <= 0) dx *= -1;
			else if(y <= 0) dy *= -1;
			dy += 1;
			x += dx;
			y += dy;
			w.lineTo(x, y);
			SimpleWindow.delay(10);
		}
	}
}