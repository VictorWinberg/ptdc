package lab4
import se.lth.cs.window.SimpleWindow;

class Turtle (val wc: SimpleWindow, val xc: Int, val yc: Int) {
  val w = wc
  private var x = xc
  private var y = yc
  private var degrees = 90
  private var write = false
  
  w.moveTo(x, y)
  def penDown { write = true }
  def penUp { write = false }
  
  def forward(i: Int) {
    x += (i * Math.cos(Math.toRadians(degrees))).toInt
    y += (i * Math.sin(Math.toRadians(-degrees))).toInt
    if(write)
      w.lineTo(x, y);
    else
      w.moveTo(x, y);
  }
  def left(beta: Int) = degrees += beta
  def jumpTo(newX: Int, newY: Int) {
    x = newX
    y = newY
    w.moveTo(x, y)
  }
  def turnNorth = degrees = 90
  def getX = x
  def getY = y
  def getDirection = degrees
}