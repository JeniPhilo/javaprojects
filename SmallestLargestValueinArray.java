package classOnes;

import java.util.Scanner;

public class SmallestLargestValueinArray {

	public static void main(String[] args) {
		int min,max;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of elements in an array: ");
		
		int n=sc.nextInt();
		sc.close();
		int arr[]=new int[n];
		
		for(int i=0; i<n; i++){
		   
			System.out.print("Enter the element "+(i+1)+": ");
			arr[i]=sc.nextInt();
		   
		}
		min=arr[0];
		max=arr[0];
		   for(int i=0; i<n; i++){
			   if(min>arr[i]){
			   min=arr[i];
			   }
		     
			   if(max<arr[i]){
			   max=arr[i]; 
			 	}
		   }
		   System.out.println("The smallest value is: "+min);
		   System.out.println("The largest value is: "+max);
	}
	
}
