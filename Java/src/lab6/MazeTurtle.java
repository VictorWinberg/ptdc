package lab6;

import lab4.Turtle;
import se.lth.cs.window.SimpleWindow;
import se.lth.cs.ptdc.maze.Maze;

public class MazeTurtle extends Turtle{

	public MazeTurtle(SimpleWindow w, int x, int y) {
		super(w, x, y);
	}

	/** L책ter sk쉕dpaddan vandra genom labyrinten maze, fr책n
	 * ing책ngen till utg책ngen */
	public void walk(Maze maze) {
		jumpTo(maze.getXEntry(), maze.getYEntry());
		penDown();
		while(!maze.atExit(getX(), getY())) {
			int dir = getDirection();
			if(!maze.wallAtLeft(dir, getX(), getY()))
				left(90);
			else if(maze.wallInFront(dir, getX(), getY()) && maze.wallAtLeft(dir - 180, getX(), getY()))
				left(180);
			else if(maze.wallInFront(dir, getX(), getY()))
				left(-90);
			forward(1);
			SimpleWindow.delay(3);
		}
	}
}
