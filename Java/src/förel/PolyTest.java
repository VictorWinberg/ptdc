package fšrel;

import se.lth.cs.window.SimpleWindow;

public class PolyTest {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PolyTest");
		Polygon p = new Polygon();
		p.addVertex(100, 20);
		p.addVertex(250, 30);
		p.addVertex(30, 200);
		p.addVertex(500, 500);
		p.addVertex(350, 200);
		p.addVertex(550, 100);
		p.draw(w);
		w.waitForMouseClick();
		p.move(100, 0);
		p.drawAll(w);
	}

}
