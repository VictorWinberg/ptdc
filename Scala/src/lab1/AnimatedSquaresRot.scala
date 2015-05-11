package lab1

import se.lth.cs.window.SimpleWindow
import se.lth.cs.ptdc.square.Square

object AnimatedSquaresRot extends App {
  println("Skriv förstorning")
  val dim = readInt()
  println("Skriv roteringsgrad")
  val rot = readInt()
  val w = new SimpleWindow(600, 600, "Animated Squares")
  val sq = new Square(300, 300, 200)
  var turn = true;
  while(true) {
    sq.draw(w)
    if(sq.getSide() < dim) turn = false;
    else if(sq.getSide() > w.getWidth()) turn = true;
    if(turn == true) {
        sq.setSide(sq.getSide() - dim);
        sq.rotate(rot);
    }
    else {
        sq.setSide(sq.getSide() + dim);
        sq.rotate(rot);
    }
    Thread sleep 10
    w.clear();
  }
}