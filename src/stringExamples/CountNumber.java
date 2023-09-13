package stringExamples;

public class CountNumber {

	public static void main(String[] args) {
		String str = "GeeksforGeeks password is : 1234";

		int digits = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				digits++;
		}
		System.out.println("Total number of Digits = " + digits);
	}
}
