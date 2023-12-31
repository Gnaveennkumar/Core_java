package stringExamples;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];

		if (s1.length() != s2.length()) {
			System.out.println("Given Strings are not anagrams");
			return;
		}

		char a[] = s1.toCharArray();

		char b[] = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean flag = Arrays.equals(a, b);
		if (flag) {
			System.out.println("Given strings are anagrams");
		} else {
			System.out.println("Given Strings are not anagrams");
		}
	}

}
