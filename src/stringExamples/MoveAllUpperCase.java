package stringExamples;

public class MoveAllUpperCase {
	

		public static void main(String[] args)
		{
			
			String m = "nAVEEn";
			String newstr = "";
			String upper = "";
			for (int i = 0; i < m.length(); i++) {
				if (Character.isUpperCase(m.charAt(i))) {
					upper += m.substring(i, i + 1);
				}
				else {
					newstr += m.substring(i, i + 1);
				}
			}
			System.out.println(newstr + upper);
		}
	}



