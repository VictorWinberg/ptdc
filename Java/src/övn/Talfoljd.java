package övn;

import java.util.Scanner;

public class Talfoljd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int a = s.nextInt();
			if(a < 0) break;
			while(a > 1) {
				if(a % 2 == 0)
					a /= 2;
				else
					a = 3 * a + 1;
				System.out.print(a + " ");
			}
			System.out.println();
		}
		s.close();
	}
}
