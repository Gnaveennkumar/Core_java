package stringExamples;

public class ByteValueToString {

	public static String convertByteToString(byte byteValue) {

		String stringValue = "" + byteValue;

		return (stringValue);
	}

	public static void main(String[] args) {

		// The byte value
		byte byteValue = 1;

		String stringValue;

		stringValue = convertByteToString(byteValue);

		System.out.println(byteValue + " after converting into string = " + stringValue);
	}
}
