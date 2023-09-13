package stringExamples;

public class StringToCharArray {

	public static void main(String args[]) {

		String str = "GeeksForGeeks";

		char[] ch = str.toCharArray();

		for (char c : ch) {

			System.out.println(c);
		}
	}
}
