package Pattern;

public class Pattern9 {
	
	public static void opprightAngle(int row)
	{
		for(int i =row;i>0;i--)
		{
			for(int j = 0;j<=row-i+1;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0;j<i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		opprightAngle(5);

	}

}
