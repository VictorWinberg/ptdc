package lab1

object Calculator extends App {
  println("Skriv två tal")
  val a = readInt()
  val sum = a + readInt()
  println("Summan av talen är " + sum)
}