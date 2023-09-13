package stringExamples;

public class LengthOfString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "xyz";

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 == len2) {
			System.out.println("The length of both the strings are equal and is " + len1);
		} else {
			System.out.println("The length of both the strings are not equal");
		}
	}
}
