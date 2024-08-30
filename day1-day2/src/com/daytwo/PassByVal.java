package com.daytwo;

public class PassByVal {
	public static void main(String[] args) {
		int sId = 25;
		PassByVal val = new PassByVal();
		System.out.println(sId);
		val.passTheValueMethod(sId);
		System.out.println("The sId are " + sId);
		
		Student student = new Student();
		System.out.println(student.getStudentId());
		val.passTheValueMethodStudent(student);
		System.out.println(student.getStudentId());
	}
	
	public void passTheValueMethod(int sId)
	{
		sId = 10;
		System.out.println("The sId are " + sId);
	}
	public void passTheValueMethodStudent(Student s)
	{
		s.setStudentId(10);
		System.out.println("The sId are " + s.getStudentId());
	}
}
