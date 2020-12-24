package programminghubgoogle.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DoubeMatrix {

	public static void main(String[] args) {
		double[][] a;
		double[] s;
		int row, col, k =0, i, j;
		double sum = 0;
		
		DecimalFormat f = new DecimalFormat("##.###");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer size of row and colum");
		row = sc.nextInt();
		col = sc.nextInt();
		
		a = new double[row][col];
		s = new double[col];
		
		System.out.println("Entrer elements of matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				a [i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("Double matrix is : ");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(a [i][j] +"  ");
			}
			System.out.println();
		}
		
		//sum of the elements of double matrix
		
		for (i = 0; i < col; i++) {
			for (j = 0; j < row; j++) {
				sum = sum + a[j][i];
			}
			s[k] = sum;
			k++;
			sum = 0;
		}
		
		for (i = 0; i < col; i++) {
			System.out.println("Sum of Column "+(i+1) + " is : " + f.format(s[i]));
		}
	}

}
