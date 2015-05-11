package lab4;

import se.lth.cs.window.SimpleWindow;

public class Turtle {
	protected SimpleWindow w;
	private double x, y;
	private int degrees = 90;
	private boolean write = false;

	public Turtle(SimpleWindow w, int x, int y) {
		this.w = w;
		this.w.moveTo(x, y);
		this.x = x;
		this.y = y;
	}

	public void penDown() {	write = true; }
	public void penUp() { write = false; }

	public void forward(int n) {
		w.moveTo((int) Math.round(x), (int) Math.round(y));
		double dx = n * Math.cos(Math.toRadians(degrees));
		double dy = n * Math.sin(Math.toRadians(-degrees));
		x += dx;
		y += dy;
		if (write)
			w.lineTo((int) Math.round(x), (int) Math.round(y));
		else
			w.moveTo((int) Math.round(x + dx), (int) Math.round(y + dy));
	}

	public void left(int beta) { degrees += beta; }

	public void jumpTo(int newX, int newY) {
		w.moveTo(newX, newY);
		x = newX;
		y = newY;
	}

	public void turnNorth() { degrees = 90; }

	public int getX() {	return (int) Math.round(x); }
	public int getY() {	return (int) Math.round(y); }
	public int getDirection() {	return degrees; }
}