package programminghubgoogle.array;

import java.util.Scanner;

public class FindClosestValueOfANumberInAnArrayTODO {

	public static void main(String[] args) {
		int a[];
		int find;
		int closest =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer size of array : ");
		int size = sc.nextInt();
		
		a = new int[size];
		
		System.out.println("Entrer le numbers in array : ");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Numbers are : ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + "  ");
		}
		
		System.out.println();
		System.out.println("Entrer Number to find closest value (la valeur la plus proche) : ");
		find = sc.nextInt();
		
		int distance = Math.abs(closest-find);  
		
		for(int i : a) {
			int distancel = Math.abs(i - find);   
			if(distance > distancel) {   //7 
				closest = i;
				distance = distancel;
			}
		}
		System.out.println("Closest Value is : "+closest);
	}

}
