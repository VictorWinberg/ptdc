package inl1

import se.lth.cs.window.SimpleWindow

class RaceTrack (val _yStart: Int, val _yFinish: Int) {
  private var yStart = _yStart
  private var yFinish = _yFinish
  
  def draw(w: SimpleWindow) {
    w.setLineWidth(3);
    w.setLineColor(java.awt.Color.RED);
    w.moveTo(40, yFinish);
    w.lineTo(w.getWidth() - 120, yFinish);
    w.setLineColor(java.awt.Color.BLACK);
    w.moveTo(40, yStart);
    w.lineTo(w.getWidth() - 120, yStart);
    w.setLineWidth(1);
  }
  
  def getFinish = yFinish
}