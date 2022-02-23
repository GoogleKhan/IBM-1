
//1. Program to count vowels and consonants in given String in Java?

package p1;

public class Problem2 {

	public static void main(String[] args) {

		String str = "I Love Java";
		
		String strLowerCase = str.toLowerCase();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < strLowerCase.length(); i++) {

			char ch = strLowerCase.charAt(i);

			if (ch == ' ') {
				continue;
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			} else {
				consonants++;
			}

		}

		System.out.println("vowels = " + vowels + " AND consonants = " + consonants);

	}

}
