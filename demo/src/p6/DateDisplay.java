package p6;

import java.util.Date;

public class DateDisplay {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date.toGMTString());
	}

}
