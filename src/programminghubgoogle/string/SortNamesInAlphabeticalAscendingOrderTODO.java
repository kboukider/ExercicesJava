package programminghubgoogle.string;

import java.util.Scanner;

public class SortNamesInAlphabeticalAscendingOrderTODO {

	public static void main(String[] args) {
		int n;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le nombre de noms que vous voulez classer par ordre alphabitique : ");
		n = sc.nextInt();
		
		String names[] = new String[n];

		Scanner sc2 = new Scanner(System.in);
		System.out.println("entrer tous les noms : ");

		for (int i = 0; i < n; i++) {
			names[i] = sc2.nextLine();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("les noms ordoner par ordee alphabitique : ");
		
		for (int i = 0; i < n; i++) {
			System.out.println(names[i]);
		}

	}

}
