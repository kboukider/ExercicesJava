package programminghubgoogle.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AnagramWithoutRecursionME {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir un premier name : ");
		String premierName = sc.nextLine();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("saisir un deuxième name : ");
		String deuxiemeName = bf.readLine();
		
	//	Scanner sc2 = new Scanner(System.in);
		
		
		if (premierName.equals(deuxiemeName)) {
			System.out.println(premierName + " et " + deuxiemeName + " sont anagrams");
		} else {
			System.out.println(premierName + " et " + deuxiemeName + " ne sont anagrams !");
		}
		
	}

}
