package com.daytwo;

public class AssignmentOne {
	public static void main(String[] args) {
		int intVal = 100;
		byte byteVal = (byte)intVal;
		byte max = 127;
		byte min = -128;
		byte sum = (byte)(max+min);
		System.out.println("Sum = " + sum);
	}
}
