package förel;

import java.awt.Color;
import java.util.ArrayList;

import se.lth.cs.window.SimpleWindow;

public class Polygon {
	private ArrayList<Point> vertices;
	
	public Polygon() {
		vertices = new ArrayList<Point>();
	}
	
	public void addVertex(int x, int y) {
		vertices.add(new Point(x,y));
	}
	
	public void addVertex(int pos, int x, int y) {
		vertices.add(pos, new Point(x,y));
	}
	
	public void removeVertex(int pos) {
		vertices.remove(pos);
	}
	
	public void move(int dx, int dy) {
		for(int i = 0; i < vertices.size(); i++) {
			vertices.get(i).move(dx, dy);
		}
	}
	
	public void draw (SimpleWindow w) {
		int sx = vertices.get(0).getX();
		int sy = vertices.get(0).getY();
		w.moveTo(sx, sy);
		for(int i = 1; i < vertices.size(); i++) {
			int x = vertices.get(i).getX();
			int y = vertices.get(i).getY();
			w.lineTo(x, y);
		}
		w.lineTo(sx, sy);
	}
	
	public void drawAll (SimpleWindow w) {
		for(int i = 1; i < vertices.size(); i++) {
			int sx = vertices.get(i).getX();
			int sy = vertices.get(i).getY();
			for(int ii = 0; ii < vertices.size() - 1; ii++) {
				int x = vertices.get(ii).getX();
				int y = vertices.get(ii).getY();
				int RGB = (int)(Math.random() * 256);
				Color color = new Color(RGB, RGB, RGB);
				w.setLineColor(color);
				w.moveTo(sx, sy);
				w.lineTo(x, y);
			}
		}
	}
	
	public int getSize() { return vertices.size(); }
}
