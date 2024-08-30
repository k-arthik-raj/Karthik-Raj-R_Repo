package com.studentconstructor;

public class StudentMain {
	public static void main(String[] args) {
		DayScholar dayScholar = new DayScholar(5, "OOP", 16000, 1001, 'D', "Manu", "No 32/3 Vijayanagar");
		dayScholar.calculateFees();
		System.out.println(dayScholar.getFees());
		System.out.println(dayScholar.getPostCourseFees());
		System.out.println(dayScholar.getPostCourseId());
		System.out.println(dayScholar);
	}
}
