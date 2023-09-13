package stringExamples;

public class RemoveGivenWord {

	public static void main(String[] args) {

		String str = "This is the Geeks For Geeks";

		String word = "the";

		str = str.replaceAll("the", "");

		str = str.trim();

		System.out.print(str);
	}
}
