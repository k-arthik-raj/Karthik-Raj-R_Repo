package day3;

public class StudentThreeMain {
	public static void main(String[] args) {
//		assignment 7
		StudentThree student = new StudentThree();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName((String)args[1],(String)args[2]);
		student.setResidentialStatus(args[3]);
		student.setFeesPerMonth(Double.parseDouble(args[4]));
		
		System.out.println(student);
		
		
//		assignment 8
		StudentThree stud = new StudentThree(Integer.parseInt(args[0]), args[3], (String)args[1],(String)args[2]);
		
		if(stud.getResidentialStatus().equals("Hostellite"))
		{
			stud.calculateFees(10000, 5000);
		}
		else
		{
			stud.calculateFees(5000);
		}
		
		System.out.println(stud);
		
	}
}
