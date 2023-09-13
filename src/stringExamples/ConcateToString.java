package stringExamples;

public class ConcateToString {
	

		public static void main(String[] args)
		{
			String str = "";

			// timer-start time
			long startTime = System.currentTimeMillis();

			for (int i = 0; i < 100000; i++) {
				// string concatenation
				str += Integer.toString(0);
			}

			// timer-end time
			long endTime = System.currentTimeMillis();

			// display the result
			System.out.println(
				"Time taken to concatenate 100000 Strings using '+' operator : "
				+ (endTime - startTime) + " ms");
		}
	}



