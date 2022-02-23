//11. Write a Java program to test whether a given double/float value is a finite floating-point value or not. 
package com.takeo;

public class Problem11 {
	public static void main(String[] args) {

		int x = 10;

//		double a = 10 / 0;
//		System.out.println(a); // ArithmaeticException

		double b = 10 / 0.0;
		System.out.println(b); // Infinity

		double c = -10 / 0.0;
		System.out.println(c);// ? -Infinity

		if (b == Double.POSITIVE_INFINITY) {
			System.out.println("Yes It is negative infinity");
		}

		double d = 0.0 / 0.0;
		System.out.println(d);// ? NaN

	}

}
