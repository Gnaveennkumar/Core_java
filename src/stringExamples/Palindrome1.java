package stringExamples;

public class Palindrome1 {
	public static void main(String[ ] args){	

		String s = args [0] ; 					
		StringBuffer sb = new StringBuffer(s);

		sb.reverse() ;

		String s1 = sb.toString( );

		if( s.equals ( s1 ) ) {
				System.out.println ("Palindrome");
		}else{
				System.out.println ("Not Palindrome");
		}				

}

}



