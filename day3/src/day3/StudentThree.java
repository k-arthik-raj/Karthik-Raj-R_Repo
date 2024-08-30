package day3;

public class StudentThree {
	private int studentId;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public StudentThree(){
		feesPerMonth = 0;
	}
	
	@Override
	public String toString() {
		return "StudentThree [studentId=" + studentId + ", studentName=" + studentName + ", residentialStatus="
				+ residentialStatus + ", feesPerMonth=" + feesPerMonth + "]";
	}
	public StudentThree(int studentId, String studentName, String residentialStatus, long feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.residentialStatus = residentialStatus;
		this.feesPerMonth = feesPerMonth;
	}
	
	public StudentThree(int studentId,  String residentialStatus, String fname, String lname) {
		super();
		this.studentId = studentId;
		this.studentName = fname+lname;
		this.residentialStatus = residentialStatus;
	}
	
	public void setStudentName(String fname, String lname) {
		this.studentName = fname + lname;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;	
	}
	public void setFeesPerMonth(double d) {
		feesPerMonth = d ;
	}
	
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees/6.0;
	}
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees/6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}
	
}
