package FunctionProblems;

import java.util.Scanner;

public class GetCombination {
	public static void display(int n,int r,int ncr)
	{
		System.out.println(n + " c " + r + " = " + ncr);
	}
	
	public static int getfact(int n)
	{
		int rv = 1 ;
		for(int i = 1;i<=n;i++)
		{
			rv *= i;
		}
		
		return rv;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number n : ");
	int n = sc.nextInt();
	System.out.println("Enter a number r : ");
	int r = sc.nextInt();
	
	int nfact = getfact(n);
	int nrfact = getfact(n-r);
	int rfact = getfact(r);
	
	int ncr = nfact / (rfact * nrfact);
	
	display(n,r,ncr);

	}

}
