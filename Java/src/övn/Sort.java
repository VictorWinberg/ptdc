package övn;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {

	private static ArrayList<Integer> ints = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n >= 0) {
			ints.add(n);
			n = scan.nextInt();
		}
		for(int i = 0; i < ints.size(); i++)
			System.out.print(ints.get(i) + " ");
		sort(ints);
		System.out.println();
		for(int i = 0; i < ints.size(); i++) 
			System.out.print(ints.get(i) + " ");
		scan.close();
	}
	
	public static void sort(ArrayList<Integer> ints) {
		for(int i = 1; i < ints.size(); i++) {
			int e = ints.get(i);
			int k = i-1;
			for(; k >= 0; k--) {
				if(e < ints.get(k)) {
					ints.set(k+1, ints.get(k));
				}
				else break;
			}
			ints.set(k+1, e);
		}
	}
}
