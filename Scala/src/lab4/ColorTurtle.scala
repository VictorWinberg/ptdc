package lab4

import java.awt.Color;
import se.lth.cs.window.SimpleWindow;

class ColorTurtle ( override val wc: SimpleWindow, 
    override val xc: Int, override val yc: Int, 
    val col: Color) extends Turtle(wc,xc,yc) { 
    var color: Color = col
    
    override def forward(i: Int) {
      w.setLineColor(color)
      super.forward(i)
    }
    
    def setColor(col: Color) = color = col
}