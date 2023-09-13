package stringExamples;

public class PrintEvenLength {
	public static void main(String[] args)

	{
		String s = "i am Geeks for Geeks and a Geek";

		for (String word : s.split(" "))

			// if length is even
			if (word.length() % 2 == 0)

				// Print the word
				System.out.println(word);
	}

}
