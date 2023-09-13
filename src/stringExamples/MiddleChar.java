package stringExamples;

public class MiddleChar {
	
		public static void
		printMiddleCharacter(String str)
		{
			// Finding string length
			int len = str.length();

			// Finding middle index of string
			int middle = len / 2;

			// Print the middle character
			// of the string
			System.out.println(str.charAt(middle));
		}

		// Driver Code
		public static void
		main(String args[])
		{
			// Given string str
			String str = "GeeksForGeeks";

			// Function Call
			printMiddleCharacter(str);
		}
	}



