package com.student;

public class Hostelite extends Student{
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Hostelite() {
		
	}
	
	public Hostelite(int studentId, char type, String fname, String lname, int feesPerMonth, 
			String hostelName, int roomno) {
		super(studentId, type, fname, lname);
		this.setFeesPerMonth(feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomno;
	}

}
