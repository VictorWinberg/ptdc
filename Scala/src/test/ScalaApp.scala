package test

object ScalaApp extends App {
  println("Skriv ditt namn!")
  val name = readLine()
  println("OCH ÅLDER!")
  val age = readInt()
  def gammal(i: Int) = i + 10
  println(name + " du är " + gammal(age) + " om 10 år")
}