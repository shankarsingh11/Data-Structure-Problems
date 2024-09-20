package Pattern;

public class Pattern2 {
	
	public static  void trianglePattern(int row)
	{
		for(int i = 0;i<row;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		trianglePattern(5);

	}

}
