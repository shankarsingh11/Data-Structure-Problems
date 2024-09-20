package Pattern;

public class Pattern8 {
	
	public static void rightTriangle(int row)
	{
		for(int i = 0;i<row;i++)
		{
			for(int j =0;j<=row-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j = 0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rightTriangle(5);

	}

}
