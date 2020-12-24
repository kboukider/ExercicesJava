package programminghubgoogle.array;

import java.util.Scanner;

public class ExampleToPassArraysToFunction {

	public static void main(String[] args) {
		int[] a;
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer size of array : ");
		size = sc.nextInt();
		
		a = new int[size];
		
		System.out.println("Entrer elements of array : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Elements of the the array are : ");
		
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		
		//passing array to the function
		addElement(a, size);
	}
	public static void addElement(int[] a, int size) {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
		}
		
		System.out.println("\nSum of the elements of arrays is : "+sum);
	}

}
