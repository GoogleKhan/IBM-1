package p2;

import p1.A;

//From the sub class but different package
public class D extends A {

	void m4() {

		System.out.println(a); // OK
		System.out.println(b); // OK through inheritance
		//System.out.println(c); // ERROR
		//System.out.println(d); // ERROR
	}

}
