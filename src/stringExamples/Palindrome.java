package stringExamples;

public class Palindrome {
	
	public static void main(String[ ] args){	

		String s = args [0] ; 
		String s1 = ""; 

		for(int i = s.length ( ) -1 ; i >=0 ; i -- ){
				s1 = s1 + s.charAt (i);
		}

		if( s.equals(s1) ){
				System.out.println("Palindrome");
		}else{
				System.out.println("Not Palindrome");
		}
}

}
