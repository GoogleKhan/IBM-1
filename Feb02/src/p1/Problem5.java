// 2, Program to reverse a String 
package p1;

public class Problem5 {

	public static void main(String[] args) {

		String str = "Shadab Khan";

		String strReverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			strReverse = strReverse + str.charAt(i);
		}
		
		System.out.println(strReverse);

	}

}
