// 24.	Program to find frequency of every alphabet in a String?
package p1;

public class Problem7 {
	public static void main(String[] args) {

		String name = "shadab khan";

		for (int i = 0; i < name.length(); i++) {

			char ch1 = name.charAt(i);

			int freq = 1;

			for (int j = i + 1; j < name.length(); j++) {

				char ch2 = name.charAt(j);

				if (ch1 == ch2) {
					freq++;
				}

			}
			System.out.println(ch1 + " founds " + freq + " times");

		}

	}
}
