package test;

import p1.A; // only class A from package p1

import p3.*; // all public c;lass from package p3;

public class Main {

	public static void main(String[] args) {

		A a1 = new A();

		p2.B b1 = new p2.B(); // fullyQualifiedTypeName

		C c1 = new C();
		D d1 = new D();
		
	//	X x1= new  X(); // Error

	}

}
