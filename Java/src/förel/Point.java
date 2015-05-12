package f�rel;

public class Point {
	private int x,y;
	
	/** Skapar en punkt med koordinaterna x, y */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/** Tar reda på x-koordinaten */
	public int getX() { return x; }
	/** Tar reda på y-koordinaten */
	public int getY() { return y; }
	
	/** Flyttar punkten avståndet dx i x-led,
	dy i y-led */
	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
}
