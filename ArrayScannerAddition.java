package classOnes;

import java.util.Scanner;

public class ArrayScannerAddition {

	public static void main(String[] args) {
		int row, column, a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer of rows");
		row = sc.nextInt();
		System.out.println("Enter the numer of column");
		column = sc.nextInt();
		int array1[][] = new int[row][column];
		int array2[][] = new int[row][column];
		int sum[][] = new int[row][column];
		System.out.println("Enter the elements of Array1:");
		for (a = 0; a < row; a++)
			for (b = 0; b < column; b++)
				array1[a][b] = sc.nextInt();

		System.out.println("Input the elements of second matrix");

		for (a = 0; a < row; a++)
			for (b = 0; b < column; b++)
				array2[a][b] = sc.nextInt();

		for (a = 0; a < row; a++)
			for (b = 0; b < column; b++)
				sum[a][b] = array1[a][b] + array2[a][b];

		System.out.println("Sum of the matrices:-");

		for (a = 0; a < row; a++) {
			for (b = 0; b < column; b++)
				System.out.print(sum[a][b] + "\t");

			System.out.println();

		}
		sc.close();
	}

}
