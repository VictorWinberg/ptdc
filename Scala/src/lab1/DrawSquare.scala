package lab1
import se.lth.cs.ptdc.square.Square;
import se.lth.cs.window.SimpleWindow;

object DrawSquare extends App {
  val w = new SimpleWindow(600, 600, "My Window")
  val sq = new Square(300, 300, 200)
  sq.draw(w)
}