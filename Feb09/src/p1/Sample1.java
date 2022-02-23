package p1;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number");
		int a = scanner.nextInt();

		System.out.println("Enter Second Number");
		int b = scanner.nextInt();

		if (b != 0) {
			int result = a / b;
			System.out.println(result);
		}else {
			System.out.println("We cannot allow 0 as divisor");
		}

		System.out.println("Done");
		scanner.close();

	}

}
