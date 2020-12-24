package programminghubgoogle.array;

import java.util.Scanner;

public class MatrixAdditionAndMultiplication {

	Scanner scan;
	int matrix1[][], matrix2[][], sum[][], multi[][]; 
	int row, colum;
	
	void creat() {
		scan = new Scanner(System.in);
		System.out.println("Matrix addition");
		
		//first matrix Creation
		System.out.println("\nEntrer number of row & colums");
		row = scan.nextInt();
		colum = scan.nextInt();
		
		 matrix1 = new int[row][colum];
		 matrix2 = new int [row][colum];
		 sum = new int [row][colum];
		 multi= new int [row][colum];
				 
		 System.out.println("Entrer the data for first matrix : ");
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				 matrix1[i][j] = scan.nextInt();
			}
		}
		 
		 System.out.println("Entrer the data for seconde matrix : ");
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				 matrix2[i][j] = scan.nextInt();
			}
		}
	}
	void display() {
		System.out.println("\nThe First Matrix is : ");
		
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				 System.out.print("\t" +matrix1[i][j]);
			}
			 System.out.println();
		}
		 
		 System.out.println("\nThe seconde Matrix is : ");
			
		 for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				 System.out.print("\t" +matrix2[i][j]);
			}
			 System.out.println();
		}
	}
	
	void add() {
		for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
			 
		}
		
		System.out.println("\n\nThe Sum is : ");
		
		for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				 System.out.print("\t" +sum[i][j]);
			}
			 System.out.println();
		}
		
	}
	
	void multiplication() {
		for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				multi[i][j] = matrix1[i][j] * matrix2[i][j];
			}
			 
		}
		
		System.out.println("\n\nThe multiplication is : ");
		
		for (int i = 0; i < row; i++) {
			 for (int j = 0; j < colum; j++) {
				 System.out.print("\t" +multi[i][j]);
			}
			 System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		MatrixAdditionAndMultiplication ob = new MatrixAdditionAndMultiplication();
		ob.creat();
		ob.display();
		ob.add();
		ob.multiplication();
		
	}

}
