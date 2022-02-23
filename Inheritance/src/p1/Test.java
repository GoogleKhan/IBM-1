package p1;

public class Test {

	public static void main(String[] args) {

		A a1 = new A();
		a1.f1(); // f1() from class A
		a1.f2(); // "f2() from class A"
		a1.f3(); // f3() from class A
		// a1.f4(); //ERROR-> f4() not found in class A

		System.out.println("============================================");

		B b1 = new B();
		b1.f1(); // f1() from class B
		b1.f2(); // f2() from class B
		b1.f3(); // f3() from class A
		b1.f4(); // f4() from class B

		System.out.println("============================================");

		A x = new B(); // A super type variable can contains a reference of sub type.
		x.f1(); // f1() from class A
		x.f2(); // f2() from class B
		x.f3(); // f3() from class A
		// x.f4(); // ERROR

		System.out.println("============================================");

		// B y = new A(); // ERROR

	}

}
