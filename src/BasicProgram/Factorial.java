package BasicProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = a1.nextInt();

		int i, fact = 1;
		for (i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println("Fact:" + fact);

	}

}

//FACTORIAL

//1=1
//2=2 =
//3=6
//4=24
//5=120
