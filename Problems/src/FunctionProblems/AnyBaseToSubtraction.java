package FunctionProblems;

import java.util.Scanner;

public class AnyBaseToSubtraction {
	
	public static int getDiffernce(int n1,int n2,int base)
	{
		int rv = 0;
		int p = 1;
		int c = 0;
		
		while( n2 > 0)
		{
			int r1 = n1%10;
			 int r2 = n2%10;
			 int d = 0;
			 r2 = r2 + c;
			 
			 if(r2>=r1) 
			 {
				 c = 0;
				 d = r2-r1;
				 rv += d*p;
				 p = p*10;
				  
			 }else
			 {    
				 c = -1;
				 d = r2+base - r1;
				 rv += d*p;
				 p = p*10;
				 
			 }
			 
			 n1 = n1/10;
			 n2 = n2/10;
		}
		
		return rv;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter a 2 number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter a base number : ");
		int base = sc.nextInt();
		
		System.out.println(getDiffernce(n1,n2,base));

	}

}
