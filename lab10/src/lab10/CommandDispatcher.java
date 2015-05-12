package lab10;

import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

class CommandDispatcher {
	private SimpleWindow w;
	private ShapeList shapes;

	public CommandDispatcher(SimpleWindow w, ShapeList shapes) {
		this.w = w;
		this.shapes = shapes;
	}

	public void mainLoop() {
		while (true) {
			w.waitForMouseClick();
			Shape shape = shapes.findHit(w.getMouseX(), w.getMouseY());
			if(shape != null) {
				w.waitForMouseClick();
				shape.moveToAndDraw(w, w.getMouseX(), w.getMouseY());
			}
		}
	}
}