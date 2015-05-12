package lab2;
import java.util.Scanner;
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

public class AnimatedSquares {
	public static void main(String[] args) {
		System.out.println("Skriv fšrminskning");
		Scanner scan = new Scanner(System.in);
		int dim = scan.nextInt();
		scan.close();

		SimpleWindow w = new SimpleWindow(600, 600, "DrawManySquares");
		Square sq = new Square(300, 300, 200);
		Boolean turn = true;
		while (true) {
			sq.draw(w);
			if(sq.getSide() < dim) turn = false;
			else if(sq.getSide() > w.getWidth()) turn = true;
			if(turn == true)
				sq.setSide(sq.getSide() - dim);
			else
				sq.setSide(sq.getSide() + dim);
			SimpleWindow.delay(10);
			w.clear();
		}
	}
}
