package com.daytwo;

public class CourseManagement {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(100);
		student.setStudentType('S');
		
		Student student2 = new Student();
		
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentType());

	}
}
