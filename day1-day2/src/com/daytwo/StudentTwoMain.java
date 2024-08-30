package com.daytwo;

public class StudentTwoMain {
	public static void main(String[] args) {
		StudentTwo studentTwo = new StudentTwo();
		studentTwo.displayDetails(studentTwo);
		
		StudentTwo student = new StudentTwo('D',"Bony","Thomas");
		student.displayDetails(studentTwo);
	}
}
