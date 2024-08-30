package com.student;

public class StudentMain {
	public static void main(String[] args) {
		Hostelite hostelite =  new Hostelite(10, 'F', "karthik", "raj",10000, "Hostel A", 835);
		System.out.println(hostelite.getFeesPerMonth());
		System.out.println(hostelite.getStudentId());
		System.out.println(hostelite.getStudentName());
		System.out.println(hostelite.getStudentType());
		System.out.println(hostelite.getHostelName());
		System.out.println(hostelite.getRoomNumber());
	}
}
