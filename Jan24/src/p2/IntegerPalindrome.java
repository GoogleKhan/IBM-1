package p2;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int num = 123; // 123/10 -> 12/10 -> 1/10 -> 0

		int x = num;
		int revNum = 0;

		while (x > 0) {
			
			int lastDigit = x % 10;

			revNum = revNum * 10 + lastDigit;

			x = x / 10;
		}

		System.out.println(num);
		System.out.println(revNum);

		if (num == revNum) {
			System.out.println("YES Palindrome");
		} else {
			System.out.println("NO, Not a Palindrome");
		}
	}

}
