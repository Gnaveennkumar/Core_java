package stringExamples;

public class WordCount {
	public static void main(String... args){
		
		String s = "Hello    Hello           My        Friend";

		//String[ ] arr = s.split("\\s+");
		String[ ] arr = s.trim().split("\\s+");
			
		System.out.println(arr.length);
}

}
