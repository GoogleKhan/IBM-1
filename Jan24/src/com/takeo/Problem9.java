// 9. Write a Java program that accepts two integers from the user and then prints the sum, the difference, 
// the product, the average, the distance (the difference between integer), 
// the maximum (the larger of the two integers), the minimum (smaller of the two integers).   
package com.takeo;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first integer value");
		int x = sc.nextInt();

		System.out.println("Enter second integer value");
		int y = sc.nextInt();

		int sum = x + y;
		System.out.println("SUM = " + sum);

		int diff = x - y;
		System.out.println("DIFF = " + diff);

		int prod = x * y;
		System.out.println("PROD = " + prod);

		int min, max;

		if (x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}

		System.out.println("MIN = " + min);
		System.out.println("MAX = " + max);

//		int min = Math.min(x, y);
//		int max = Math.max(x, y);
		
		sc.close();

	}

}
