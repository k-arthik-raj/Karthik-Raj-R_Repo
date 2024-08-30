package day3;

public class DemoArray {

	public int firstArrayMatrix[][] = {{1,1,1},{1,1,1}};
	public int secondArrayMatrix[][] = {{2,2,2},{2,2,2}};
	
	public void displayMatrix(int[][] array, int c) {
		int n = array.length;
		int m = array[0].length;
		
		System.out.println("Matrix " + c);
		
		for(int i = 0;i<n;i++)
		{
			for(int j= 0;j<m;j++)
				System.out.print(array[i][j] + " ");
			System.out.println("");
		}
		
	}
	
	public void addMatrices(int[][] array1,int[][] array2) {
		int n = array1.length;
		int m = array1[0].length;
		
		System.out.println("sum of the matrices");
		
		for(int i = 0;i<n;i++)
		{
			for(int j= 0;j<m;j++)
				System.out.print((array1[i][j] + array2[i][j]) + " ");
			System.out.println("");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		DemoArray demoArray = new DemoArray();
		demoArray.displayMatrix(demoArray.firstArrayMatrix, 1);
		demoArray.displayMatrix(demoArray.secondArrayMatrix, 2);
		demoArray.addMatrices(demoArray.firstArrayMatrix, demoArray.secondArrayMatrix);
	}
}
