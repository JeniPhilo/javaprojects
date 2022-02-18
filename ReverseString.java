package classOnes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		int i;
		char c;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the String Value: ");
		String str = sc.nextLine();
		sc.close();
		int k = str.length() - 1; // (N-1)th index

		String z = " ";

		for (i = k; i >= 0; i--) // taking from the (N-1)th index to 0th index
		{
			c = str.charAt(i);
			z = z + c;
		}

		System.out.println("Reversed String: " + z);

	}

}
