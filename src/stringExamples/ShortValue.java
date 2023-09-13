package stringExamples;

public class ShortValue {
	public static short convertStringToShort(String str) {

		return Short.parseShort(str);
	}

	public static void main(String[] args) {

		String stringValue = "1";

		short shortValue;

		shortValue = convertStringToShort(stringValue);

		System.out.println(stringValue + " after converting into short = " + shortValue);
	}
}
