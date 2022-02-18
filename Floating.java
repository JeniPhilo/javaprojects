package classOnes;

import java.util.Scanner;

public class Floating {

	public static void main(String[] args) {

		float num1, num2;
//num1= 1235f;
//num2=2534f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		num1 = sc.nextFloat();
		System.out.println("Enter the second number");
		num2 = sc.nextFloat();

		if (Math.ceil(Math.abs(num1 - num2)) < 0.01) {
			System.out.println("The Given numbers are same");

		}

		else {
			System.out.println("The numbers are not matching");
		}
		System.out.println("Enter the radius of circle:");
		sc.close();
	}

}
