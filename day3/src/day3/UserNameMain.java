package day3;

public class UserNameMain {
	public static void main(String[] args) {
		UserName name = new UserName("aUsErnAMe");
		System.out.println("length is :" + name.getLength() + "\n username is: " + name.getUsername());
		name.greet();
		
		System.out.println(name.lower());
		System.out.println(name.startWithA());
		System.out.println(name.upper());
		name.replace();
		System.out.println(name.getUsername());
		
	}
}
