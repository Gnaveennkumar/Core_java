package stringExamples;

public class StringToBoolean {
	
		// Method 1
		// To convert a string to its boolean object
		public static boolean stringToBoolean(String str)
		{

			// Converting a given string
			// to its boolean object
			// using valueOf() method
			boolean b1 = Boolean.valueOf(str);

			// Returning boolean object
			return b1;
		}

		// Method 2
		// Main driver method
		public static void main(String args[])
		{
			// Given input string 1
			String str = "yes";

			// Printing the desired boolean
			System.out.println(stringToBoolean(str));

			// Given input string 2
			str = "true";

			// Printing the desired boolean
			System.out.println(stringToBoolean(str));

			// Given input string 3
			str = "false";

			// Printing the desired boolean
			System.out.println(stringToBoolean(str));
		}
	}



