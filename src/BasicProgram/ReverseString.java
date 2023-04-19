package BasicProgram;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "abcde";
		System.out.println("Present:" +s);
		
		for (int i = s.length(); i > 0; --i) {
			
			char ans= s.charAt(i - 1);
		
			System.out.print(ans);

		}

	}

}
