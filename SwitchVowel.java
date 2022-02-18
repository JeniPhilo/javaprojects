package classOnes;

import java.util.Scanner;

public class SwitchVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :");
		String str = sc.nextLine();
		sc.close();
		char z = Character.toUpperCase(str.charAt(0));
		
		switch (z) {
		case '1': case '2': case'3': case'4': case '5': case'6': case'7': case'8': case'9': case'0':
			System.out.println("not an alphabet");
			break;
		case 'A':
			System.out.println(str + " is a Vowel.");
			break;
		case 'E':
			System.out.println(str + " is a Vowel.");
			break;
		case 'I':
			System.out.println(str + " is a Vowel.");
			break;
		case 'O':
			System.out.println(str + " is a Vowel.");
		case 'U':
			System.out.println(str + " is a Vowel."); 
			break;

		default:
			System.out.println(str + " is a Non-Vowel Character.");
		}

	}

}
