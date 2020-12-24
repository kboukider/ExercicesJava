package programminghubgoogle.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer no. of elements to sort : ");
		int size = in.nextInt();
		
		int iArr[] = new int[size];
		System.out.println("Entrer "+size+" integers : ");
		for (int i = 0; i < size; i++) {
			iArr[i] = in.nextInt();
		}
		
		for (int number : iArr) {
			System.out.println("Number = " +number);
		}
		
		//sorting array
		Arrays.sort(iArr);
		
		System.out.println("The sorted int array is : ");
		for (int number : iArr) {
			System.out.println("Number = "+number);
		}
	}

}
