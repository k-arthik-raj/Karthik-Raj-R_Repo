package com.courseregdebug;

class CourseRegistration{
	static protected int regId; 
	protected String courseName; 
	CourseRegistration() { 
		regId++;
	}
	CourseRegistration (String cName) {
		this();
		courseName=cName;
	}
	public void displayDetails() {
		System.out.println("Registration ID: "+regId); 
		System.out.println("CourseName : "+courseName);
	}
}
class Student extends CourseRegistration{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	private int semesterFees;
	private int feesPerMonth;
	Student (int studentId, String cName) {
		super (cName);
		this.studentId=studentId;
	}
	Student (int studentId, char studentType, String studName, int semFees, String cName) {
		super (cName);
		this.studentId = studentId;
		this.studentType=studentType;
		studentName=studName;
		semesterFees=semFees;
	}
}
class DayScholar extends Student{
	private String residentialAddress;
	DayScholar (int studentId, char studentType, String studName,
			int semFees, String residentialAddress, String cName)
	{
		super (studentId, studentType, studName, semFees, cName);
		this.residentialAddress=residentialAddress;
	}
	
	
	public void displayDetails() {
		//need to display the Details of the Student and
		//DayScholar
		
		System.out.println(this.studentId + " " + this.studentName + " " + this.studentType + " " + residentialAddress);
	}
}
