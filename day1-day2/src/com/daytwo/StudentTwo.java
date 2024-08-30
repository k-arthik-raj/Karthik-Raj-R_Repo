package com.daytwo;

public class StudentTwo {
	public static int studentId = 549;
	public char studentType;
	public String studentName;
	
	
	public StudentTwo()
	{
		studentId++;
	}
	
	public StudentTwo(char sType,String fname, String lname)
	{
		this.studentName = fname + lname;
		this.studentType = sType;
		studentId += 1;
		
	}
	
	public void displayDetails(StudentTwo s) {
		System.out.println(studentName + " " + studentType + " " + studentId);
	}
	
}
