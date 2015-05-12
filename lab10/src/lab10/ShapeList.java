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
	
	/** L채gger in figuren s i listan */
	public void insert(Shape s) {
		shapes.add(s);
	}
	
	/** Ritar upp figurerna i listan i f쉗stret w */
	public void draw(SimpleWindow w) {
		for(Shape shape : shapes) {
			shape.draw(w);
		}
	}
	
	/** Tar reda p책 en figur som ligger n채ra punkten xc,yc (null om ingen
		s책dan figur finns i listan */
	public Shape findHit(int xc, int yc) {
		for(Shape shape : shapes) {
			if(shape.near(xc, yc))
				return shape;
		}
		return null;
	}
}
