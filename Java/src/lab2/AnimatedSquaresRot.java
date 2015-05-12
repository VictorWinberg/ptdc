package lab2;
import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class AnimatedSquaresRot {
	public static void main(String[] args) {
		System.out.println("Skriv fšrminskning och rotation");
		Scanner scan = new Scanner(System.in);
		int dim = scan.nextInt();
		int rot = scan.nextInt();
		scan.close();

		SimpleWindow w = new SimpleWindow(600, 600, "DrawManySquares");
		Square sq = new Square(300, 300, 200);
		Boolean shrink = true;
		while (true) {
			sq.draw(w);
			if(sq.getSide() < dim) shrink = false;
			else if(sq.getSide() > w.getWidth()) shrink = true;
			if(shrink == true) {
				sq.setSide(sq.getSide() - dim);
				sq.rotate(rot);
			}
			else {
				sq.setSide(sq.getSide() + dim);
				sq.rotate(rot);
			}
			SimpleWindow.delay(10);
			w.clear();
		}
	}
}
