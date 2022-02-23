package mon;

public class MethodOverloding {

	void add(int a, String b) {
		System.out.println(a + b);
	}

	//Number of Parameter is different
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	//Data type is different
	void add(String a, String b) {
		System.out.println(a + b);
	}
	
	//order of data type of parameter is different.
	void add(String a, int b) {
		System.out.println(a + b);
	}

}
