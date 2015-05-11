package lab4

import se.lth.cs.window.SimpleWindow
import java.awt.Color

object TestTurtl extends App {
  val w = new SimpleWindow(600, 600, "MY SCALATURTLE!!!")
  val t = new ColorTurtle(w, 300, 300, Color.BLACK)
  t.penDown
  
  while(true) {
    t.forward(10)
    t.left((360 * Math.random()).toInt)
    Thread sleep 1
    if(t.getX < 0 || t.getX > w.getWidth() || t.getY < 0 || t.getY > w.getHeight()) {
      t.jumpTo(300, 300);
      val R = (256 * Math.random()).toInt
      val G = (256 * Math.random()).toInt
      val B = (256 * Math.random()).toInt
      t.setColor(new Color(R, G, B))
    }
  }
}