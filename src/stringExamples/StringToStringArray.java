package stringExamples;

public class StringToStringArray {
	
		public static void main(String[] args)
		{
			
			String gfg = "Welcome, to, GFG";

			
			String[] str = gfg.split(",");

			
			for (String s : str) {

				
				System.out.println(s);
			}
		}
	}



