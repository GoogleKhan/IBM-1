// 6. Write a Java program to compute body mass index (BMI).
package com.takeo;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input weight in pounds:");
		double weight = sc.nextDouble();

		System.out.println("Input height in inches:");
		double height = sc.nextDouble();

		double bmi = (weight / (height * height)) * 703;

		System.out.println("BMI is : " + bmi);

		sc.close();

	}

}
