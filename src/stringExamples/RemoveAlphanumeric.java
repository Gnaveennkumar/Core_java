package stringExamples;

public class RemoveAlphanumeric {

	public static String removeNonAlphanumeric(String str) {
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");

		
		return str;
	}

	// Driver Code
	public static void main(String args[]) {

		// Test Case 1:
		String str1 = "@!Geeks-for'Geeks, 123";
		System.out.println(removeNonAlphanumeric(str1));

		// Test Case 2:
		String str2 = "Geeks_for$ Geeks?{}[]";
		System.out.println(removeNonAlphanumeric(str2));

		// Test Case 3:
		String str3 = "GeeksforGeeks123";
		System.out.println(removeNonAlphanumeric(str3));
	}
}
