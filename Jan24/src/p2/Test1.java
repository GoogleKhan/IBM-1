package p2;

public class Test1 {
	public static void main(String[] args) {

		int x = 10;

		boolean b1 = x == 15;
		System.out.println(b1); // false

		b1 = b1 == false;
		System.out.println(b1); // true

		Car c1 = new Car();
		Car c2 = new Car();

		boolean b2 = c1 == c2;
		System.out.println(b2); //false

//		boolean b = 5 < x & x < 20;
//		System.out.println(b); // true |
	}
}
