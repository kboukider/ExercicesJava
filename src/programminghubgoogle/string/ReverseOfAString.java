package programminghubgoogle.string;

import java.util.Scanner;

public class ReverseOfAString {

	public static void main(String[] args) {
		String original, reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer un mot a inverser : ");
		original = sc.nextLine();
		
		int length = original.length();
		for (int i = length-1; i >= 0; i--) {
			reverse += original.charAt(i);
		}
		System.out.println("le resultat est : " + reverse);

	}

}
