package p1;

public class Test2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("----------Accessing elements using for loop------------");

		for (int i = arr.length - 1; i >= 0; i--) {

			int x = arr[i];
			System.out.println(x);
		}

		System.out.println("----------Accessing elements using forEach loop------------");

		for (int x : arr) {
			System.out.println(x);
		}

	}

}
