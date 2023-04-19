
package BasicProgram;

import java.util.*;

public class PrimeNumber_WithoutUserInput {

	public static void main(String[] args) {

		int a = 8, temp = 0;
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
