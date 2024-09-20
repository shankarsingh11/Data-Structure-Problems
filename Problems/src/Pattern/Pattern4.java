package Pattern;

public class Pattern4 {

	public static void numtriangle(int row)
	{
		for(int i = 1 ; i<=row;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		numtriangle(5);

	}

}
