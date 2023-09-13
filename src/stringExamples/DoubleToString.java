package stringExamples;

public class DoubleToString {

	public static String convertDoubleToString(double doubleValue) {

		String stringValue = "" + doubleValue;

		return (stringValue);
	}

	// Driver code
	public static void main(String[] args) {

		// The double value
		double doubleValue = 1;

		// The expected string value
		String stringValue;

		// Convert double to string
		stringValue = convertDoubleToString(doubleValue);

		// Print the expected string value
		System.out.println(doubleValue + " after converting into string = " + stringValue);
	}
}
