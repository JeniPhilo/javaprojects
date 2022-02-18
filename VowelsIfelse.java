package classOnes;

import java.util.Scanner;

public class VowelsIfelse {

	public static void main(String[] args) {
		char i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		i= sc.next().charAt(0);
		sc.close();
//		To read a char, we use next().charAt(0). next() 
//		function returns the next token/word in the input as a string and charAt(0)
//		function returns the first character in that string.
		char a=Character.toUpperCase(i);
		if((a>='A'&& a<='Z')){
		if( a=='A') {
			System.out.println("the entered alphabet is a vowel"+a);
			
		}
		else if(a=='E') {
			System.out.println("the entered alphabet is a vowel"+a);
			
		}
		else if(a=='I') {
			System.out.println("the entered alphabet is a vowel"+a);
		}
		else if (a=='O'){
			System.out.println("the entered alphabet is a vowel"+a);
		}
		else if(a=='U') {
			System.out.println("the entered alphabet is a vowel"+a);
		}
		
		else {
			System.out.println("The entered alphabet "+ a +" is not a vowel");
		}
		}
		else {
			System.out.println("The entered character "+a+" is not an alphabet");
		}
		

	}

}
