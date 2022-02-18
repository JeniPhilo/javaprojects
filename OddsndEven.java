package classOnes;

import java.util.Scanner;

public class OddsndEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
	
		
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		
		if (num%2==0) {
			System.out.println("Entered number is even");
			
		}
		else {
			System.out.println("The entered number is odd");
		}
		
		

	}
	

}
