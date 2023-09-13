package stringExamples;

public class StringIsEmpty {

	public static boolean isStringEmpty(String str) {

		if (str.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String str1 = "GeeksforGeeks";
		String str2 = "";

		System.out.println("Is string \"" + str1 + "\" empty? " + isStringEmpty(str1));
		System.out.println("Is string \"" + str2 + "\" empty? " + isStringEmpty(str2));
	}
}
