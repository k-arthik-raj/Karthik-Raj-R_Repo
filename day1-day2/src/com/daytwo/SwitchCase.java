package com.daytwo;

import java.util.concurrent.atomic.AtomicMarkableReference;

public class SwitchCase {
	
	public static void main(String[] args) {
		String c;
		try {
			c = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			c = "B";
		}
		
		char ch = c.charAt(0);
		
		switch (ch) {
		case 'A':
			System.out.println("80-100");
			break;
		case 'B':
			System.out.println("73-79");
			break;
		case 'C':
			System.out.println("65-72");
			break;
		case 'D':
			System.out.println("55-64");
			break;
		case 'E':
			System.out.println("<55");
		default:
			break;
		}
		
	}
}
