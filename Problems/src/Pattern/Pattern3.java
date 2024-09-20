package Pattern;

public class Pattern3 {

	public static void reversetriangle(int row)
	{
		for(int i = row ;i>=0;i--) {
			  for(int j = 0 ; j<=i;j++)
			  {
				  System.out.print(" * ");
			  }
			  System.out.println();
		}
	}
	public static void main(String[] args) {
		
		reversetriangle(5);

	}

}
