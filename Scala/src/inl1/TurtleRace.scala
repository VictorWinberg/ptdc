package inl1

import se.lth.cs.window.SimpleWindow
import lab4.ColorTurtle
import java.awt.Color

object TurtleRace extends App {
  val w = new SimpleWindow(800, 800, "TurtleRace")
  val turtle1 = new ColorTurtle(w, 200, 680, Color.BLUE)
  val turtle2 = new ColorTurtle(w, 400, 680, Color.RED)
  turtle1.penDown
  turtle2.penDown
  val track = new RaceTrack(680, 100)
  val race = new RacingEvent(track, turtle1, turtle2)
  race.startRace(w)
}