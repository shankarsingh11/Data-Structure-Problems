package FunctionProblems;

import java.util.Scanner;

public class AnyBaseToDecimal{
	
	public static void display(int anynum ,int anybase,int num)
	{
		System.out.println("Conversion is => "+"(" + anynum+ ")" + anybase+ " = " + "(" + num + ")" + "10");
	}
	
	
	
	public static int getValueInDecimal(int n,int base)
	{
		int rv = 0;
		
		int p = 1;
		
		 while(n>0)
			 {
				 int rem = n % 10;
				     n = n / 10;
				     
				 //  rv += rem * (int)(Math.pow(10,x++));// method 1
				     
				 // method 2
				     rv += rem * p;
				     p = p * base;
				     
				   
			 }
		 return rv;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a any number : ");
		int anynum = sc.nextInt();
		System.out.println("Enter a base number : ");
		int anybase = sc.nextInt();
		
		display(anynum,anybase,getValueInDecimal(anynum,anybase));

	}

}
