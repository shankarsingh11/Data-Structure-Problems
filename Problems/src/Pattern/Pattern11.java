package Pattern;

public class Pattern11 {

	public static void main(String[] args) {
		
        int row = 4;
		
		for(int i = row+1;i>0;i--)
		{
			for(int j = 0;j<row-i+1;j++)
			{
				System.out.print("  ");
			}
			for(int j = 0;j<2*i-1;j++) 
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}

	}

}
