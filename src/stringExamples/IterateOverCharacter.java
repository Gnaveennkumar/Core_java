package stringExamples;

public class IterateOverCharacter {
	static void getChar(String str) {

		for (int i = 0; i < str.length(); i++) {

			System.out.print(str.charAt(i));

			System.out.print(" ");
		}
	}

	public static void main(String[] args) {

		String str = "GeeksforGeeks";
		getChar(str);
	}
}
