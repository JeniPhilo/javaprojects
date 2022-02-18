package classOnes;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMostUsedChar {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("lenght : "+ str.length());
		char[] charArray = new char[str.length()];
		int[] countArray = new int[str.length()];
		
		for(int i=0;i<str.length();i++) {
			charArray[i]=str.charAt(i);
			// string to character array
		}
		System.out.println("Char array : "+Arrays.toString(charArray));
		int count=0;
		for(int i=0;i<charArray.length;i++) {
			count=0;
			for(int j=0;j<charArray.length;j++) {
				if(charArray[i]==charArray[j]) {
					count++;
					// compare each elements and count its occurrence. 
				}
			}
			
			countArray[i]=count;
			
			 
		}
		System.out.println("Count array : "+Arrays.toString(countArray));

		  
		
	}

}
