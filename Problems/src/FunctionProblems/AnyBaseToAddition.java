package FunctionProblems;

import java.util.Scanner;

public class AnyBaseToAddition {
	
	public static int getSum(int n1,int n2,int b) {
		
		int c = 0;
		int rv = 0;
		int p = 1;
		
		while(n1>0 || n2 > 0 || c > 0)
		{
			int r1 = n1%10;
			int r2 = n2%10;
			   n1= n1/10;
			   n2 = n2/10;
		int d = r1+r2+c;
		  c = d/b;
		  d = d%b;
		  rv += d*p;
		   p = p*10;
		}
		
		return rv;

 }
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number :  ");
		int n1 = sc.nextInt();
		System.out.println("Enter a 2 number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter a base number : ");
		int b = sc.nextInt();
		System.out.println("sum is : "+getSum(n1,n2,b));

	}

}
