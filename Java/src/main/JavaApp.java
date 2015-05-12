package main;
import java.util.Scanner;

public class JavaApp {
	
	public static void main(String[] args) {
		System.out.println("Skriv ditt namn!");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		System.out.println("OCH ÅLDER!");
		int age = s.nextInt();
		System.out.println(name + " du är " + Gammal(age) + " om 10 �r");
		s.close();
	}
	
	static int Gammal(int i) {
		return (i + 10);
	}
}