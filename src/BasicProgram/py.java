package BasicProgram;

public class py {

	public static void main(String[] args) {

		int i, j, row = 3;

		//used to write blank spaces
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
		
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
