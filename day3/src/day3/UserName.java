package day3;

public class UserName {
	private String username;

	public void greet() {
		System.out.println("Hi " + username);
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public int getLength() {
		return username.length();
	}
	
	public String lower() {
		return username.toLowerCase();
	}
	
	public String upper() {
		return username.toUpperCase();
	}
	
	public void replace() {
		username = "SEED";
	}
	
	public boolean startWithA() {
		return username.startsWith("a");
	}

	public UserName(String username) {
		super();
		this.username =  username;
	}
}
