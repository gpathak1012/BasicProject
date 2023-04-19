package BasicProgram;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,num=10;
		for (int i = 1; i <= 10; i++) {
			if (num % 2 == 0) {
				sum = sum + i;

			}

			System.out.println("Sum: " + sum);
		}

	
	}
}
