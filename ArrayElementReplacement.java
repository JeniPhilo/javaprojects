package classOnes;

import java.util.Arrays;

public class ArrayElementReplacement {
//	divide the first array into two and create new array. 
//	add elements to the next array with new element in the given index position. 

	public static void main(String[] args) {
		int array[]={1,2,3,4,5}; 
		System.out.println("The in put array is: "+ Arrays.toString(array));
		int newElement=22;
		int index=3 ;	
		int[] firstArray = Arrays.copyOfRange(array, 0, index); 
		// divide array from index 0 to entered index.
		int[] secondArray = Arrays.copyOfRange(array, index, array.length); 
		// second array from index to first array length. 
		System.out.println(Arrays.toString(firstArray));
		System.out.println(Arrays.toString(secondArray));
		
		int newTemporary[] = new int[firstArray.length+secondArray.length+1];
		// new temp array created with size (firstArray.length + secondArray.length + 1)
		int j=0;
		for(int i=0;i<firstArray.length;i++) {
			newTemporary[i]=firstArray[i];
			j++;
			//
		}
		newTemporary[j]=newElement;
		j++;
		for(int i=0;i<secondArray.length;i++) {
			newTemporary[j]=secondArray[i];
			j++;
		}
		System.out.println("New array is: "+Arrays.toString(newTemporary));
	}

}











//array[3]=22;
//for(int i=0,j=0; i<6; i++,j++) {
////System.out.println(array[i]);
//	if(i==index) {
//		newTemparray[j]=newElement;
//		newTemparray[j+1]=array[i];
//		j++;
//	}
//	else if(i<array.length){
//		newTemparray[j]=array[i];
//	}
//}
//System.out.println("New array is: "+Arrays.toString(newTemparray));
