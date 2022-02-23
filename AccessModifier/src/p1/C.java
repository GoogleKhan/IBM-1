package p1;

//From the sub class but same package
public class C extends A {

	void m3() {

		System.out.println(a); // OK
		System.out.println(b); // OK
		System.out.println(c); // OK
		//System.out.println(d); // ERROR
	}

}
