package stringExamples;

import java.util.Arrays;
import java.util.List;

public class CommaSeperated {

	public static void main(String args[]) {

		String string = "Geeks For Geeks";

		System.out.println("String: " + string);

		String[] elements = string.split(" ");

		List<String> list = Arrays.asList(elements);

		System.out.println("Comma separated List: " + list);
	}
}
