package FunctionProblems;

import java.util.Scanner;

public class GetDigitFrequency {
	
	public static int  getDigitFrequency(int n,int d)
	{
		 int count = 0;
		 while(n != 0)
		 {
			 int digit = n % 10;
			    n = n /10;
			    if(digit == d)
			    {
			    	count++;
			    }
		 }
		 
		return count;
				 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number :: ");
		int n = sc.nextInt();
		System.out.println("Enter a digit number:: ");
		int d = sc.nextInt();
	   System.out.println("frequency digit occurances is = " + getDigitFrequency(n,d));	

	}

}
