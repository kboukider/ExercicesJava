package programminghubgoogle.string;

import java.util.Scanner;

public class CountNumberOfWordsInASentence {

	public static void main(String[] args) {

		System.out.println("Entrer une phrase svp :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("le nombre de mots sont : " +countWords(str));

	}

	public static int countWords(String str) {
		
		String[] words = str.split(" ");
		int count = words.length;
				return count;
	}
	
	
}
