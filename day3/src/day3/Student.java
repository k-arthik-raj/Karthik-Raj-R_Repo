package day3;

public class Student {
	private int studentId;
	private char studentType;
private static int studentCount = 0;
	
	
	static {
		studentCount = 10;
		
	}
	
	
	public static int getStudentCount() {
		return studentCount;
	}
	
	
	
	public Student()
	{
		
		studentId = ++studentCount;
		studentType = 'F';
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
}
