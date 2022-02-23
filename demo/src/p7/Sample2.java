package p7;

public class Sample2 {

	int sum(int a, int b) {
		// ----
		// ---
		return a + b;
	}

	void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Sample2 obj = new Sample2();

		int x = obj.sum(3, 10);
		System.out.println(x);

		obj.add(5, 10); // 15

	}

}
