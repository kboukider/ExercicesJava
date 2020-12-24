package programminghubgoogle.array;

import java.util.Scanner;

public class CreateDisplayMatrix {

	Scanner scan;
	int matrix[][];
	int row, colum;
	
	void create() {	
		scan = new Scanner(System.in);
		System.out.println("Matrix Creation");
		System.out.println("\nEntrer number of rows : ");
		row = scan.nextInt();
		
		System.out.println("Entrer nimber of columns : ");
		colum = scan.nextInt();
		
		matrix = new int [row][colum];
		
		System.out.println("Entrer the data : ");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colum; j++) {
				 matrix[i][j] = scan.nextInt();
			}
		}
		
	}
	
	void display() {
		System.out.println("\nThe matrix is : ");
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colum; j++) {
				System.out.print("\t" + matrix[i][j] );
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		CreateDisplayMatrix obj = new CreateDisplayMatrix();
		obj.create();
		obj.display();
	}

}
