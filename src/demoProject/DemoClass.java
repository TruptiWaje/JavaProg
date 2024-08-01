package demoProject;



public class DemoClass {
	public static void main(String args[])
	{
		
		int[][] a =  {{3,5,8},{2,9,4}};
		
		for(int row=0; row<a.length;row++)
		{
			System.out.println(" ");
			for (int col = 0; col < a[0].length; col++)
			{
			System.out.print(a[row][col]);
		}
		
		
		}
	
	}

}
