package com.studentconstructor;

public class Student {
	private static int studentId=0;
	private char sutdentType;
	private String studentName;
	
	public Student() {
		studentId++;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getSutdentType() {
		return sutdentType;
	}
	public void setSutdentType(char sutdentType) {
		this.sutdentType = sutdentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public Student(int studentId, char sutdentType, String studentName) {
		super();
		this.studentId = studentId;
		this.sutdentType = sutdentType;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sutdentType=" + sutdentType + ", studentName=" + studentName
				+ "]";
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
