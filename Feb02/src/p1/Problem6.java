// 5.	Program to break a string to words in Java?
package p1;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your full name");
		String str = sc.nextLine();

		sc.close();

		String[] words = str.split(" ");

		String initials = "";

		for (int i = 0; i < words.length - 1; i++) {

			char ch = words[i].charAt(0);

			initials = initials + ch + ". ";
		}
		initials = initials + words[words.length - 1];

		System.out.println(initials);

	}

}
