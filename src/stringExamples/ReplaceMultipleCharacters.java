package stringExamples;

public class ReplaceMultipleCharacters {

	public static void main(String[] args) {
		String Str = new String("Welcome to geeksforgeeks");

		System.out.print("After replacing all o with T : ");
		System.out.println(Str.replace('o', 'T'));

		System.out.print("After replacing all e with D : ");
		System.out.println(Str.replace('e', 'D'));

	}
}
