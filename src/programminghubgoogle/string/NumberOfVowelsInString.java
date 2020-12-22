package programminghubgoogle.string;

import java.util.Scanner;

public class NumberOfVowelsInString {

	public static void main(String[] args) {
		System.out.println("Merci de saisir une phrase, pour calculer le nombre de voyeles !");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int nombreVowel = 0;
		
		for (int i = 0; i < text.length(); i++) {
			if (text.toLowerCase().charAt(i) == 'a' 
					|| text.toLowerCase().charAt(i) == 'e'
					|| text.toLowerCase().charAt(i) == 'i' 
					|| text.toLowerCase().charAt(i) == 'u'
					|| text.toLowerCase().charAt(i) == 'o') {
					 nombreVowel ++;
			}
		}
		System.out.println("le ne mobre de voyels est = "+nombreVowel);
	}

}
