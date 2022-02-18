package classOnes;

import java.util.Scanner;

public class PrimeInIntervel {
	/*
	 * A prime number is an integer greater than one and can be divisible by only
	 * itself and one-- remainder is 0 for 1
	 * i.e it has only two factors.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number1 : ");
		int n1 = sc.nextInt(); // number= n
		System.out.println("enter number2 ");
		int n2 = sc.nextInt();
		sc.close();
		if (n1 > n2) {
			System.out.println("sorry, the invalid limit");
		} else {
			String result = "";

			for (int i = n1; i <= n2; i++) {
				if (primecheck(i)) { 
					result = result + " " + i;
				}
			}

			if (result.isEmpty()) {
				System.out.println("No prime numers between given range ");
			} else {
				System.out.println("Prime numbers " + result);
			}

		}

	}

	public static boolean primecheck(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				// counts numbers having remainder 0

			}
		}
		if (count == 2) {

			return true;
		}
		return false;

	}

}
