package Pattern;

public class Pattern12 {
	
	public static void pattern12(int row)
	{
		for(int i = row;i>0;i--) {
			
			for(int j = 0;j<row-i+1;j++) {
				System.out.print("  ");
			}
			for(int j = 0;j<i;j++) {
				System.out.print("  *");
			}
			System.out.println();
		}

		for(int i = 0;i<row;i++) {
			
			for(int j = 0;j<=row-i+1;j++) {
				System.out.print("  ");
			}
			for(int j = 0;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
	 
		pattern12(5);

	}

}
