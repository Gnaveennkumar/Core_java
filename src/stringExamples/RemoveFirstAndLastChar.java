package stringExamples;

public class RemoveFirstAndLastChar {
	
		public static String
		removeFirstandLast(String str)
		{

			// Creating a StringBuilder object
			StringBuilder sb = new StringBuilder(str);

		
			sb.deleteCharAt(str.length() - 1);

		
			sb.deleteCharAt(0);

			return sb.toString();
		}

		// Driver Code
		public static void main(String args[])
		{
			// Given String str
			String str = "GeeksForGeeks";

			// Print the modified string
			System.out.println(
				removeFirstandLast(str));
		}
	}



