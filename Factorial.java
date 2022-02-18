package classOnes;

public class Factorial {

	public static void main(String[] args) {
		int fact, i,num;
		fact=1;
		num=5;
		for(i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println(" factorial of "+num+" is "+fact);
}
}