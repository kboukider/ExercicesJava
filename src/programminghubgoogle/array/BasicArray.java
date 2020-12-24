package programminghubgoogle.array;

import java.util.Scanner;

public class BasicArray {

	public static void main(String[] args) {
		int[] arr;
		int size, i;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la taille du tableau : ");
		size = sc.nextInt();
		
		arr = new int[size];
		System.out.println("Entrer les elements du tableau : ");
		
		for (i = 0; i < size; i++) {
			  arr[i] = sc.nextInt();
		}
		
		System.out.println("les elements du tableau sont : ");
		
		for (i = 0; i  < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
