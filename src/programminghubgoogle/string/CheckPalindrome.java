package programminghubgoogle.string;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println("Merci de saisir un mot : ");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		
		int length = original.length();
		
		for (int i = length - 1; i >= 0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("il sagit bien d'un mot palindrome :) ,  original => "+original + " // reverse => " + reverse );
		} else {
			System.out.println("il ne s'agit pas d'un mot palindrome :( ,  original => "+original + " // reverse => " + reverse);
		}
	}

}
