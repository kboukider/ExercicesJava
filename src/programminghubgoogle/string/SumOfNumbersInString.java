package programminghubgoogle.string;

import java.util.Scanner;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir une phrase avec des chiffres et des caractères tous mélanger, le programe va calculer la somme des chiffre :)  \nvotre phrase : ");
		
		String str =  sc.nextLine()  ;   // "sha12bhu467";
		
		// replace all character to "" except decimals
		str = str.replaceAll("\\D+", "");
		
		System.out.println(str);
		
		char c [] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			sum += Character.getNumericValue(c[i]);
		}
		System.out.println("la somme :) => "+sum);
	}

}
