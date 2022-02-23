// 5. Write a Java program that prints the current date and time.  
package com.takeo;

import java.time.LocalDateTime;
import java.util.Date;

public class Problem5 {

	public static void main(String[] args) {
		
		Date now1 = new Date();

		System.out.println(now1);
		
		//JODA Date API
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);

	}

}
