package programminghubgoogle.array;

import java.util.Scanner;

public class MagicMatrixTODO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer the size of the matrix : ");
		int n = sc.nextInt();
		
		if(n>5) {
			System.out.println("Entrer a number between 1 to 5");
		} else {
			int A[][] = new int [n][n];
			int i, j, k, t;
			/*Initializing every cell of the matrix with0 */
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					A[i][j] = 0;
				}
			}
			
			/*When the size of the matrix is Odd*/
			if(n%2 !=0) {
				i =0;
				j = n/2;
				k =1;
				while (k<=n*n) {
					A[i][j] = k++;
					i--; //Makin one step upward
					j++; //Moving one step to the right
					if(i<0 && j>n-1) {  //Condition for the top-right corner element
						i = i+2;
						j--;
					}
					if(i<0) { //Wrapping around the row if it goes out of boundray
						i = n -1;
					}
					if(j>n-1) {
						// Wrapping around the colum if it goes out of boundray
						j=0;
					}
					if(A[i][j]>0) { 
						// Condition when the cell is already filed
						i = i+2;
						j--;
					}
				}
			}
			/*Whene the size matrix is even*/
			else {
				k=1;
				/*Filling  the matrix with natural numbers from 1 till n*n */
				for(i=0; i<n; i++) {
					for(j=0; j<n; j++) {
						A[i][j] = k++;
					}
				}
				j = n-1;
				for (i=0; i<n/2; i++) {
					/*swapping corner elements of secondray diagonal*/
					t = A[i][j];
					A[i][j] = A[j][i];
					A[j][i] = t;
					
					j--;
				}
			}
			/*Printing the magic matrix*/
			System.out.println("The magic Matrix of size " + n+"x"+n+ " is.");
			for(i=0; i<n; i++) {
				for (j=0; j<n; j++) {
					System.out.print(A[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

}
