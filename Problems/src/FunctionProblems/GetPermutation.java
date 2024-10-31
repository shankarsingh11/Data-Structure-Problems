package FunctionProblems;

import java.util.Scanner;

public class GetPermutation {
	
	public static void display(int n,int r,int npr)
	{
		 System.out.println(n + " p " + r + " = " + npr);
	}
	
	public static int getfact(int n)
	{
		int rv =1;
		for(int i = 1 ; i<=n;i++)
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
		int nmrfact = getfact(n-r);
		
		int npr = nfact/nmrfact;
		
		display(n,r, npr);

	}

}
