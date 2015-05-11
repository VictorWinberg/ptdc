package lab6;

import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.maze.Maze;

public class MazeTest {

	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(400, 400, "Maze");
		MazeTurtle t = new MazeTurtle(w, 0, 0);
		int n = 1;
		while(true) {
			Maze m = new Maze(n);
			m.draw(w);
			SimpleWindow.delay(200);
			t.walk(m);
			SimpleWindow.delay(500);
			w.clear();
			if(n == 5) n = 0;
			n++;
		}
	}

}
