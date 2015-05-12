package extra;

import java.util.Scanner;

public class QuessNumber {

	public static void print(Object x) { System.out.println(x); }
	
	public static void main(String[] args) {
		int number = (int) (Math.random() * 10001);
		print("Jag tÃ¤nker pŒ ett tal mellan 1 och 10000 - gissa vilket.");
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			int guess = scan.nextInt();
			if(guess > number) print("Fšr stort, fšrsšk igen!");
			else if(guess < number) print("Fšr litet, fšrsšk igen!");
			else { print("RÃ¤tt pŒ " + tries + " fšrsšk!"); break; }
			tries++;
		}
		scan.close();
	}
}