// 8. Write a Java program that reads a number and display the square, cube, and fourth power.  
package com.takeo;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a integer value");
		int x = sc.nextInt();

		int sq = (int) Math.pow(x, 2);
		System.out.println("Square of " + x + " is " + sq);

		int cube = (int) Math.pow(x, 3);
		System.out.println("Cube of " + x + " is " + cube);
		
		int fourth = (int) Math.pow(x, 4);
		System.out.println("Fourth of " + x + " is " + fourth);

		sc.close();

	}

}
