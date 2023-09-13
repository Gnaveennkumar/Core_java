package stringExamples;

import java.util.Arrays;

public class StringToByteArray {

	public static void main(String[] args) {

		String ss = "GeeksforGeeks";

		System.out.println("String: " + ss);

		byte[] res = ss.getBytes();

		System.out.println("Byte Array:" + Arrays.toString(res));
	}
}
