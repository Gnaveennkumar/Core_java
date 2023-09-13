package com.object;

public class AlphaBets {
	public static boolean onlyAlphabets(String str, int n) {

		if (str == null || str == "") {
			return false;
		}

		for (int i = 0; i < n; i++) {

			if (!Character.isLetter(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {

		String str = "GeeksforGeeks";
		int len = str.length();

		System.out.println(onlyAlphabets(str, len));
	}

}
