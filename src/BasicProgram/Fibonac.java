package BasicProgram;

public class Fibonac {

	public static void main(String[] args) {

		int a = 10, f = 0, f1 = 1, f2;
	

		for (int i = 1; i <= a; i++) {

			f2 = f1 + f;
			System.out.println(" " + f2);
			f = f1;
			f1 = f2;

		}

	}

}

//fnacci
//0   
//1    
//1
//2
//3
//5
//8
//13
//21