package lab3;
import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.square.Square;

public class PrintClickSquare {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "PrintClickDists");
		Square sq = new Square(w.getWidth() / 2, w.getHeight() / 2, 50);
		sq.draw(w);
		int oldX = w.getWidth() / 2;
		int oldY = w.getHeight() / 2;
		while (true) {
			w.waitForMouseClick();
			int newX = w.getMouseX();
			int newY = w.getMouseY();
			System.out.println("Avstånd i x-led: " + (newX - oldX) + ", "
					+ "i y-led: " + (newY - oldY));
			sq.move(newX - oldX, newY - oldY);
			sq.draw(w);
			oldX = newX;
			oldY = newY;
		}
	}
}
