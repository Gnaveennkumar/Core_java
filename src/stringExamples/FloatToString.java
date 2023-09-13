package stringExamples;

public class FloatToString {

	public static String convertFloatToString(float floatValue) {

		String stringValue = "" + floatValue;

		return (stringValue);
	}

	// Driver code
	public static void main(String[] args) {

		// The float value
		float floatValue = 1f;

		// The expected string value
		String stringValue;

		// Convert float to string
		stringValue = convertFloatToString(floatValue);

		// Print the expected string value
		System.out.println(floatValue + " after converting into string = " + stringValue);
	}
}
