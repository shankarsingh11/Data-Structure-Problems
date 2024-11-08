package FunctionProblems;

import java.util.Scanner;

public class DecimalToAnyBase {
	
	public static void displayNum(int decnum ,int basenum,int num)
	{
		System.out.println("Conversion is => "+"(" + decnum + ")" + "10 " + " = " + "(" + num + ")" + basenum);
	}
	
	public static int convertDecimalToAnyBase(int n,int base)
	{
		int rv = 0;
		
		int p = 1;
		
		 while(n>0)
			 {
				 int rem = n % base;
				     n = n / base;
				     
				 //  rv += rem * (int)(Math.pow(10,x++));// method 1
				     
				 // method 2
				     rv += rem * p;
				     p = p * 10;
				     
				   
			 }
		 return rv;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number : ");
		int decnum = sc.nextInt();
		System.out.println("Enter a base number : ");
		int basenum = sc.nextInt();
		
		displayNum(decnum,basenum,convertDecimalToAnyBase(decnum,basenum));

	}

}
