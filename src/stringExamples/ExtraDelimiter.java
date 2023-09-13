package stringExamples;

public class ExtraDelimiter {

	public static void main(String args[]) {

		String str = "Geeks, For, Geeks,";

		char delimiter = ',';

		System.out.println("Original String: " + str);

		int index = str.lastIndexOf(delimiter);

		str = str.substring(0, index) + str.substring(index + 1);

		System.out.println("String with extra " + "delimiter removed: " + str);
	}
}
