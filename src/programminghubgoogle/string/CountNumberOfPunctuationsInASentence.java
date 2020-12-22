package programminghubgoogle.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountNumberOfPunctuationsInASentence {

	public static void main(String[] args) throws IOException {
		
		int i, punct = 0, lettre = 0, espace = 0;
		int str2 = 0;
		System.out.println("entrer un string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for ( i = 0; i < str.length() ; i++) {
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <= 'B' || ch >= 'a' && ch <= 'z' ) {
				lettre ++; 
			} else if (ch ==' ' || ch =='\t' ) {
				espace ++;
			} else {
				punct ++;
			}
		}
		System.out.println("pour la phrase : ' "  + str + " ' ");
		System.out.println("le nombre de lettre = " + lettre);
		System.out.println("le nombre d'espace = " + espace);
		System.out.println("le nombre de ponctuation = " + punct);
		
	}

}
