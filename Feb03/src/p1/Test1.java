package p1;

public class Test1 {

	public static void main(String[] args) {

		String str = "Java";   

		str = str.replace('J', 'L');
		
		//Java, Lava

		System.out.println(str);

		String s1 = "I Love ";
		s1 = s1 + "Java";
		
		// I Love, Java, I love Java

		System.out.println(s1);
	}

}
