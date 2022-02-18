package classOnes;

public class Replacement {

	public static void main(String[] args) {
		String st1 = ("The quick brown fox jumps over the lazy dog.");
		String st2 = st1.replaceAll("fox", "cat");
		System.out.println("The Given Sentence is : " + st1);
		System.out.println("The Replaced Sentence is: " + st2);

	}

}
