package Pattern;

public class Pattern6 {
	
	public static void oppositeTriangle(int row)
	{
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<+row-i-1;j++)
			{
				System.out.print("  ");
			}
			for(int j = 0;j<=i;j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		 oppositeTriangle(5);
	}

}
