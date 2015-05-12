package lab10;
import java.util.ArrayList;
import se.lth.cs.ptdc.shapes.Shape;
import se.lth.cs.window.SimpleWindow;

public class ShapeList {
	
	private ArrayList<Shape> shapes;
	
	/** Skapar en tom lista */
	public ShapeList() {
		shapes = new ArrayList<Shape>();
	}
	
	/** LÃ¤gger in figuren s i listan */
	public void insert(Shape s) {
		shapes.add(s);
	}
	
	/** Ritar upp figurerna i listan i fšnstret w */
	public void draw(SimpleWindow w) {
		for(Shape shape : shapes) {
			shape.draw(w);
		}
	}
	
	/** Tar reda pŒ en figur som ligger nÃ¤ra punkten xc,yc (null om ingen
		sŒdan figur finns i listan */
	public Shape findHit(int xc, int yc) {
		for(Shape shape : shapes) {
			if(shape.near(xc, yc))
				return shape;
		}
		return null;
	}
}
