package p1;

import java.io.IOException;

public class Papa {

	public static void main(String[] args) throws IOException {
		f1();
	}

	static void f1() throws IOException {

		f2();
	}

	static private void f2() throws IOException {
		f3();

	}

	static private void f3() throws IOException {

	}

}
