package com.student;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
	public Student(){
		
	}
	
	public Student(int studentId,  char type, String fname, String lname) {
		super();
		this.studentType = type;
		this.studentId = studentId;
		this.studentName = fname+lname;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String fname,String lname) {
		this.studentName = fname + lname;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	
	
}
