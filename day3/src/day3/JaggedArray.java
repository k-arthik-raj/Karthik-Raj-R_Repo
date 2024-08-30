package day3;

public class JaggedArray {
	public static String[][] arr = {{"tony","JAVA","C","C++"},{"Thomas","JAVA","UNIX",""},
			{"Dinil","LINUX","Oracle",""},{"Delvin","RDBMS","C#","Oracle"}};
	
	public static void main(String[] args) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i][0]=="Delvin")
			{
				for(int j = 0;j<arr[i].length;j++)
					System.out.println(arr[i][j]);
			}
		}
	}
	
}
