// 2, Program to reverse a String USING StringBuffer
package p1;

public class Problem3 {

	public static void main(String[] args) {

		String str = "Shadab Khan";

		StringBuffer sb = new StringBuffer(str); // StringBuffer from String
		StringBuffer sbRev = sb.reverse();

		String strRev = sbRev.toString(); // String from StringBuffer
		System.out.println(strRev);

	}

}
