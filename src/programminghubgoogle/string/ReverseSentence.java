package programminghubgoogle.string;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		System.out.println("-------- METHODE 1 --------");
		System.out.println("merci de saisir une phrase à inverser ! : ");
		Scanner sc = new Scanner(System.in);
		String phraseOriginale = sc.nextLine();
		String phraseReverse = "";
		for (int i = phraseOriginale.length()-1; i >= 0; i--) {
			phraseReverse += phraseOriginale.charAt(i);
			
		}
		
		System.out.println("le resultat est : " + phraseReverse);
	
		System.out.println("-------- METHODE 2 --------");
		////// methode 2 officielle //////
		
		System.out.println("merci de saisir une phrase à inverser ! : ");
		Scanner sc2 = new Scanner(System.in);
		String phraseOriginale2 = sc.nextLine();
		
		String [] words = phraseOriginale2.split("");
		
		System.out.println("le resultat est : ");
		for (int i = phraseOriginale2.length()-1; i >= 0; i--) {	
			System.out.print(words[i]);
		}
		
	}

}
