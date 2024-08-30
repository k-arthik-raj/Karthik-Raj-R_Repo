package com.studentconstructor;

public class PostGradStudent extends Student{
	private int postCourseId;
	private String postCourseName;
	private int postCourseFees;
	
	
	
	public int getPostCourseFees() {
		return postCourseFees;
	}



	public void setPostCourseFees(int postCourseFees) {
		this.postCourseFees = postCourseFees;
	}



	public int getPostCourseId() {
		return postCourseId;
	}



	public void setPostCourseId(int postCourseId) {
		this.postCourseId = postCourseId;
	}



	public String getPostCourseName() {
		return postCourseName;
	}



	public void setPostCourseName(String postCourseName) {
		this.postCourseName = postCourseName;
	}



	public PostGradStudent(int postCourseId, String postCourseName, int postCourseFees, int studentId, char sutdentType, String studentName) {
		super(studentId, sutdentType, studentName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCourseFees = postCourseFees;
	}
	
}
