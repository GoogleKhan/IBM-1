package p2;

public class Fibonacci {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 ....

		int x = 0;
		int y = 1;

		System.out.print(x + " ");
		System.out.print(y + " ");

		for (int i = 3; i <= 10; i++) {
			
			int next = x + y;
			System.out.print(next + " ");
			
			x = y;
			y = next;
			

		}
	}

}
