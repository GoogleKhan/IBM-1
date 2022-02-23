package p1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int N = arr.length;
		
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < (N / 2); i++) {

			int first = arr[i];
			int last = arr[N - 1 - i];

			arr[N - 1 - i] = first;
			arr[i] = last;

		}

		System.out.println(Arrays.toString(arr));
	}

}
