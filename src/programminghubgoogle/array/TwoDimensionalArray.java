package programminghubgoogle.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		System.out.print("Entrer le nombre de lignes : ");
		int rows = scaner.nextInt();
		
		System.out.print("Entrer le nombre de colonnes : ");
		int cols = scaner.nextInt();
		
		int [] [] a = new int [rows] [cols];
		
		System.out.println("Entrer " + rows + "x" +cols + "=" + (rows*cols) + " integers : ");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = scaner.nextInt();
			}
		}
		System.out.println("Here are those "+ (rows*cols) + " integers in a " + rows + "x"+ cols+ " 2-d array :");
		System.out.println(Arrays.deepToString(a));
	}

}
