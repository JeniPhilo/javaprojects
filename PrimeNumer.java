package classOnes;

import java.util.Scanner;

public class PrimeNumer {
	/*
	 * A prime number is an integer greater than one and can be divisible by only
	 * itself and one eg: 2,3,5,7,11,13,17,
	 * i.e it has only two factors.
	 */

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number : ");
		int n = sc.nextInt(); // number= n
		sc.close();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				// counts factors having remainder 0

			}
		}
		if (count == 2) {
			System.out.println("Entered number "+ n+" is a prime number ");
		}

		else {
			System.out.println("Entered number "+ n+" is Not a prime number ");
		}

	}

}
