package lab5;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

import se.lth.cs.window.SimpleWindow;

public class RandomTurtle {

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("Antal turtles, svänggrad, hastighet, fönsterstorlek");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int dir = scan.nextInt();
		int speed = scan.nextInt();
		int size = scan.nextInt();
		SimpleWindow w = new SimpleWindow(size, size, "RandomTurle");
		ColorTurtle[] t = new ColorTurtle[n];
		w.setLineWidth(3);
		for (int i = 0; i < t.length; i++) {
			int R = rand.nextInt(256);
			int G = rand.nextInt(256);
			int B = rand.nextInt(256);
			t[i] = new ColorTurtle(w, size/2, size/2, new Color(R, G, B));
			t[i].penDown();
		}
		scan.close();
		while (true) {
			for (ColorTurtle t1 : t) {
				t1.forward(rand.nextInt(10) + 1);
				t1.left(rand.nextInt(dir) - dir/2);
				if(t1.getX() < 0)
					t1.jumpTo(w.getWidth(), t1.getY());
				else if(t1.getX() > w.getWidth())
					t1.jumpTo(0, t1.getY());
				else if(t1.getY() < 0)
					t1.jumpTo(t1.getX(), w.getHeight());
				else if(t1.getY() > w.getHeight())
					t1.jumpTo(t1.getX(), 0);
			}
			SimpleWindow.delay(100/speed);
		}
	}
}