package BasicProgram;

public class SwapThreeVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20, c = 30;
		
		System.out.println(a + " " + b + " " + c);
		a = b;
		b = c;
		c = a;
		System.out.println(a + " " + b + " " + c);

	}

}
