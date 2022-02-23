// 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.
package com.takeo;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		System.out.println("Enter temp in Fahrenheit : ");

		double fahrenheit = console.nextDouble();

		// °C = (°F - 32) × 5/9

		double celsius = ((fahrenheit - 32) * 5) / 9;
		
		System.out.println("Temp in Celsius : " + celsius);

		console.close();

	}

}
