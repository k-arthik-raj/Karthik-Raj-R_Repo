package day3;

public class StudentTwoMain {
	public static void main(String[] args) {
		StudentTwo studentTwo = new StudentTwo();
		studentTwo.setStudentId(10);
		studentTwo.setStudentName("ram","sham");
		studentTwo.setStudentType('S');
		
		System.out.println(studentTwo.getStudentId() + " " + studentTwo.getStudentName() + " " + studentTwo.getStudentType());
		
		
		StudentTwo student = new StudentTwo(10,'S',"rem","ram");
		System.out.println(student);
	}
}
