
package BasicProgram;

import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner a1 = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Number");
		int a = a1.nextInt();

		int temp = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				temp = temp + 1;

			}
		}
		if (temp > 0) {
			System.out.println("NOT PRIME");
		} else {
			System.out.println("Prime");
		}

	}

}

//
//Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//System.out.println("Enter username");
//String userName = myObj.nextLine();