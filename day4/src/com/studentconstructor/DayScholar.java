package com.studentconstructor;

public class DayScholar extends PostGradStudent{
	private String residentialAddress;
	private int fees;
	public DayScholar(int postCourseId, String postCourseName, int postCourseFees, int studentId, char sutdentType, String studentName, String address) {
		super(postCourseId, postCourseName, postCourseFees, studentId, sutdentType, studentName);
		this.residentialAddress = address;
	}
	public void calculateFees() {
		fees = this.getPostCourseFees()/6;
	}
	
	public int getFees() {
		return fees;
	}
}
