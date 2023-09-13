package stringExamples;

public class AllUpperCase {

	static public String move(String str) {

		int len = str.length();

		String low = "";

		String upr = "";

		char ch;
		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				upr += ch;
			} else {
				low += ch;
			}
		}
		return low + upr;
	}

	public static void main(String args[]) {
		String str = "Geeksforgeeks A Computer Science Portal for Geeks!!";
		System.out.println("Before Operation: " + str);
		System.out.println("After Operation: " + move(str));
	}
}
