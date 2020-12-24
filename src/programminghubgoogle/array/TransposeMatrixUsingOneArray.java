package programminghubgoogle.array;

import java.util.Scanner;

public class TransposeMatrixUsingOneArray {

	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEntrer number of row : ");
		int r = sc.nextInt();

		System.out.println("\nEntrer number of columns : ");
		int c = sc.nextInt();

		int a[][] = new int[r][c];

		System.out.println("\nEntrer matrix elements : ");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Logic for Transpose
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				if (i < j) {
					int temp = a[j][i];
					a[j][i] = a[i][j];
					a[i][j] = temp;
				}
			}
		}

		// print Transpose matrix
		System.out.println("\nTranspose Matrix : ");
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
