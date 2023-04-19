package BasicProgram;

public class Palindrome {

	public static void main(String[] args) {
		String s = "12321";
		String t = " ";
		int len = s.length();
		for (int i =len- 1; i >= 0; --i) {
			t = s + s.charAt(i);
			
			if (s.equals(t)) 
			System.out.println("pali");
			else 
			System.out.println("NON pali");
			
			
//			int length = a.length(); 
//			for (int i = length - 1; i >= 0; i--) 
//			b = b + a.charAt(i);
//			if(a.equals(b)) 
//			System.out.println("The string is a palindrome."); 
//			else
//			System.out.println("The string is not a palindrome.");
		}

	}

}
