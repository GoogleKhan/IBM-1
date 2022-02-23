// 2. Write a Java program that reads a number in inches, converts it to meters.
package com.takeo;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter length in inches : ");

		double inches = console.nextDouble();

		// Note: One inch is 0.0254 meter.

		double meters = inches * 0.0254;

		System.out.println("Length in meters : " + meters);

		console.close();

	}

}
