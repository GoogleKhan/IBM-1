// Take 2 String check whether they are equals or not without using equals method

package p1;

public class Test3 {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "java";

		// boolean isEquals = str1.equals(str2);

		boolean isEquals = str1.equalsIgnoreCase(str2);

		if (isEquals) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

		System.out.println("---------------------------");

		// int result = str1.compareTo(str2);

		int result = str1.compareToIgnoreCase(str2);

		if (result == 0) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}

	}

}
