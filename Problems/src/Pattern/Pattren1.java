package Pattern;

public class Pattren1{
	
      // Square Pattern 
	
	public static void squarePattern(int row,int col) 
	{
		 for(int i = 0;i<row;i++) {
			 for(int j = 0;j<col;j++) {
				 System.out.print(" * ");
			 }
			 System.out.println();
		 }
	}
	
	public static void main(String [] args) {
	
		squarePattern(5,5);
	}

}
