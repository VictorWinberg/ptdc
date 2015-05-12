package extra;

import java.util.Scanner;

public class QuessNumber {

	public static void print(Object x) { System.out.println(x); }
	
	public static void main(String[] args) {
		int number = (int) (Math.random() * 10001);
		print("Jag t채nker p책 ett tal mellan 1 och 10000 - gissa vilket.");
		int tries = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			int guess = scan.nextInt();
			if(guess > number) print("F쉜 stort, f쉜s쉓 igen!");
			else if(guess < number) print("F쉜 litet, f쉜s쉓 igen!");
			else { print("R채tt p책 " + tries + " f쉜s쉓!"); break; }
			tries++;
		}
		scan.close();
	}
}