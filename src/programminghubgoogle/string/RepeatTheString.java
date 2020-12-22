package programminghubgoogle.string;

import java.util.Scanner;

public class RepeatTheString {

	public static void main(String[] args) {
		System.out.println("Saisir le mot que vous voulez repeter : ");
		Scanner sc = new Scanner(System.in);
		String mot = sc.nextLine();
		
		System.out.println("Saisir le nombre de fois que vous voulez repeter : ");
		Scanner sc1 = new Scanner(System.in);
		int number = sc1.nextInt();
		
		System.out.println("le resultat : ");
		for (int i = 0; i < number; i++) {
			System.out.print(mot+ " ");
		}
	}

}
