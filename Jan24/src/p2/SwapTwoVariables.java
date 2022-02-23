package p2;

public class SwapTwoVariables {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		System.out.println("Before Swapping x = " + x + " and y = " + y);

//		int z = x;
//		x = y;
//		y = z;

//		x = x + y; // 30
//		y = x - y; // 10
//		x = x - y; // 20

		x = x * y; // 200
		y = x / y; // 10;
		x = x / y; // 20

		System.out.println("After Swapping x = " + x + " and y = " + y);
	}

}
