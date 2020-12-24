package programminghubgoogle.array;

import java.util.Scanner;

public class SymmetricMatrixTODO {

	public static void main(String[] args) {

		int m, n, c, d;
		int matrix[][], transpose[][];
		Scanner in = new Scanner(System.in);
		System.out.println("Entrer the number of rows and culumns of matrix : ");
		m = in.nextInt();
		n = in.nextInt();
		if(m==n) {
			matrix = new int [m][n];
			System.out.println("Entrer the elements of matrix");
			
			for (c = 0; c < m; c++) {
				for (d = 0; d < n; d++) {
					matrix[c][d] = in.nextInt();
				}
			}
			
			transpose = new int[n][m];
			for (c = 0; c < m; c++) {
				for (d = 0; d < n; d++) {
					transpose[d][c] = matrix[c][d];
				}
			}
			System.out.println("Transpose of entered matrix :-");
			
			for (c = 0; c < n; c++) {
				for (d = 0; d < m; d++) {
					System.out.print(transpose[c][d] + "\t");
				}
				System.out.println("\n");
			}
			
			for (c = 0; c < n; c++) {
				for (d = 0; d < m; d++) {
					if(matrix[c][d] != transpose[c][d])
						break;
					
				}
				if(d != m)
					break;
			}
			if(c==n)
				System.out.println("Symmetric matrix.");
		}
		else 
			System.out.println("please enter Square matrix");
	}

}
