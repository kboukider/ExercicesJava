package programminghubgoogle.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringSortingInAscendingOrderAlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = null;
		System.out.println("Combien de noms voulez vous ordonner : ");
		int size = sc.nextInt();
		
		names = new String [size];
		
		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			System.out.print("Saisir le " + (i + 1) + " nom : ");
			  names[i] = sc2.nextLine();
		}
		
		// sort the array, using the sort methode of the Arrays class
		Arrays.sort(names);
		
		System.out.println("\nles noms ordonnés => ");
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
