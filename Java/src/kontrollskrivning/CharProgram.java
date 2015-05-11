package kontrollskrivning;

public class CharProgram {

	public static void main(String[] args) {
		Character[] letters = new Character[26];
		for (int i = 0; i < letters.length; i++)
			letters[i] = (char) ('a' + i);
		swapChars1(letters, 0, 1);
		System.out.println(letters[0] + " " + letters[1]);
		swapChars2(letters[2], letters[3]);
		System.out.println(letters[2] + " " + letters[3]);
	}
	
	public static void swapChars1(Character[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void swapChars2(Character c1, Character c2) {
		Character temp = c1;
		c1 = c2.charValue();
		c2 = temp.charValue();
	}
}
