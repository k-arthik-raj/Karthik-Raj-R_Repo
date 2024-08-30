package com.studentdebug;

public class DayScholar extends Student {
	private String residentialAddress;
	DayScholar (int studentId, char studentType, String
			studName, int semFees, String residentialAddress) {
		super (studentId,studentType, studName, semFees);
		this.residentialAddress = residentialAddress;
	}
	
	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println(residentialAddress);
	}
}