package com.studentdebug;


class Student{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	Student (int studentId) {
		this.studentId=studentId;
	}
	Student (int studentId, char studentType, String studName, int
			semFees) {
		super();
		this.studentId = studentId;
		this.studentType=studentType;
		studentName=studName;
		semesterFees=semFees;
	}
	void displayDetails() {
		System.out.println(studentId + " " + studentName + " " + studentType + " " + semesterFees + " " + feesPerMonth);
	}
}


