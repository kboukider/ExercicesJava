package programminghubgoogle.array;

import java.util.Scanner;

public class MirrorMatrix {

	public static void main(String[] args) {
		int row, column;
		Scanner in = new Scanner(System.in);

		System.out.println("Entrer number of rows for matrix : ");
		row = in.nextInt();
		System.out.println("Entrer number of column for matrix : ");
		column = in.nextInt();

		int matrix[][] = new int[row][column];

		System.out.println("Entrer matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		System.out.println("The matrix : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column ; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println("Mirror matrix : ");

		for (int i = 0; i < row; i++) {
			for (int j = column - 1; j >= 0; j--) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
