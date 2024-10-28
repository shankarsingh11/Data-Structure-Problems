package Pattern;

public class Pattern35 {
	
	public static void pattern35(int row)
	{
		for(int i = 1;i<=row;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		pattern35(4);

	}

}
