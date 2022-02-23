// 2, Program to reverse a String WITHOUT USING StringBuffer
package p1;

public class Problem4 {

	public static void main(String[] args) {

		String str = "Shadab Khan";

		char[] arr = str.toCharArray();

		int size = arr.length;

		for (int i = 0; i < size / 2; i++) {

			char first = arr[i];
			char last = arr[size - i - 1];

			arr[i] = last;
			arr[size - i - 1] = first;

		}

		String strReversed = new String(arr);
		System.out.println(strReversed);

	}

}
