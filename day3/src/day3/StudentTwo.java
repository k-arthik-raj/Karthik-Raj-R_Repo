package day3;

public class StudentTwo {
	public int studentId;
	public char studentType;
	public String studentName;
	
	
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

	public StudentTwo()
	{
		studentId = 10;
		studentType = 'F';
	}
	
	@Override
	public String toString() {
		return "StudentTwo [studentId=" + studentId + ", studentType=" + studentType + ", studentName=" + studentName
				+ "]";
	}

	public StudentTwo(int id,char sType,String fname, String lname)
	{
		this.studentId = id;
		this.studentName = fname + lname;
		this.studentType = sType;
		
	}
	
	public void setStudentName(String fname, String lname) {
		this.studentName = fname+lname;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void displayDetails(StudentTwo s) {
		System.out.println(studentName + " " + studentType + " " + studentId);
	}
	
}
