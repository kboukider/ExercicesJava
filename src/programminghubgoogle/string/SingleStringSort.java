package programminghubgoogle.string;

import java.util.Arrays;
import java.util.Scanner;

public class SingleStringSort {

	public static void main(String[] args) {

		System.out.println("saisir les lettre à classer par alphabet : ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		char [] chars = original.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
	//	System.out.println("Pre-sorting string : "+original);
		System.out.println("Sorted string : "+sorted);
	}

}
