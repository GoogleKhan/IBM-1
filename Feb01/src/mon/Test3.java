package mon;

public class Test3 {

	int i;
	static int j;

	// instance method
	void m1() {
		System.out.println("I am m1()");
	}

	// static method
	static void m2() {
		System.out.println("I am m2()");
	}

	public static void main(String[] args) {

		Test3.m2();

		Test3 obj = new Test3();
		obj.m1();

	}

}
