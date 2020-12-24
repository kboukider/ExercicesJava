package programminghubgoogle.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort2DArrayTODO {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nEntrer the no. of rows :");
		int m = Integer.parseInt(br.readLine());
		
		System.out.println("\nEntrer the no. of colums :");
		int n = Integer.parseInt(br.readLine());
		
		int A[][] = new int [m][n];
		System.out.println();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Entrer the elements : ");
				A[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("\nThe orifginal array : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print( A[i][j] + "\t");
			}
			System.out.println();
		}
		
		//Sorting the 2D Array
		int t = 0;
		for (int x = 0; x < m; x++) {
			for (int y = 0; y < n; y++) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						if(A[i][j] > A[x][y]) {
							t = A[x][y];
							A[x][y] = A[i][j];
							A[i][j] = t;
						}
					}
				}
			}
		}
		
		//Print the sorted 2D Array
		System.out.println("\nTheSorted Array : ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
