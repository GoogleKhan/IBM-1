// 3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
package com.takeo;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter a number between 0 to 1000 : ");

		int number = console.nextInt();

		if (number <= 0 || number >= 1000) {
			System.out.println("Invalid input, please try again..");
			console.close();
			return;
		}

		int sum = 0;
		int num = number;

		while (num > 0) {

			int lastDigit = num % 10;
			sum = sum + lastDigit;

			num = num / 10;

		}

		System.out.println("Sum of digits for " + number + " is " + sum); // Sum of digits for 567 is 18

		console.close();

	}

}
