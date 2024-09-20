package Pattern;

public class Pattern5 {
	
	public static void pyramidPattern(int row)
	{
		  for(int i = 0;i<=row/2;i++)
		  {
			  for(int j = 0;j<=i;j++) {
				  System.out.print(" * ");
			  }
			  System.out.println();
		  }
		  
		  for(int i = row/2-1;i>=0;i--) {
			  
			  for(int j = 0;j<=i;j++)
			  {
				  System.out.print(" * ");
			  }
			  System.out.println();
		  }
	}

	public static void main(String[] args) {
		
		pyramidPattern(4);

	}

}
