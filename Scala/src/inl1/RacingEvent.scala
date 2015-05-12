package inl1

import java.util.Random;
import lab4.ColorTurtle
import se.lth.cs.window.SimpleWindow

class RacingEvent (val track: RaceTrack, val turtle1: ColorTurtle, val turtle2: ColorTurtle) {
  def startRace(w: SimpleWindow) {
    track.draw(w)
    val rand = new Random()
    while(true) {
      turtle1.forward(rand.nextInt(3))
      turtle2.forward(rand.nextInt(3))
      if(turtle1.getY < track.getFinish || turtle2.getY < track.getFinish) {
        w.moveTo(w.getWidth/2 - 40, w.getHeight / 2)
        if(turtle1.getY < turtle2.getY)
          w.writeText("Turtle 1 won!")
        else
          w.writeText("Turtle 2 won!")
        return
      }
      Thread.sleep(10)
    }
  }
}