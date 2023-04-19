package BasicProgram;

public class pr {

	public static void main(String[] args) {
		int i = 0;
		int num = 0;
	
		String primeNumbers = "";

		for (i = 100; i <= 200; i++) {
			int sum = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					sum = sum + 1;
				}
			}
			if (sum == 2) {
				
				primeNumbers = primeNumbers + i + " ";
			}
		}
		
		System.out.println(primeNumbers);
	}
}
