package FunctionProblems;

import java.util.Scanner;

public class AnyBaseToAnyBase {
		
	public static void displayNum(int anynum ,int base1,int base2 ,int num1,int num2)
	{
		System.out.println("Conversion is => "+"(" + anynum+ ")" + base1+ " = " + "(" + num1 + ")" + "10" + "==>" + "(" + num2+")" + base2 );
	}
	
	public static int getValueAnyBaseToAnyBase(int anynum,int b1,int b2)
	{
		 int dec = getValueInDecimal(anynum,b1);
		 int dm = getValueInAnyBase(dec,b2);
		 return dm;
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
	
	public static int getValueInAnyBase(int n,int base)
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
		System.out.println("Enter a any number : ");
		int anynum = sc.nextInt();
		System.out.println("Enter a first base number : ");
		int base1 = sc.nextInt();
		System.out.println("Enter a 2 base number : ");
		int base2 = sc.nextInt();
		displayNum(anynum,base1,base2,getValueInDecimal(anynum,base1),getValueAnyBaseToAnyBase(anynum,base1,base2));

	}

}
