package FunctionProblems;
import java.util.Scanner;

public class AnyBaseToMultiplicuation {
	
	public static int getMultiply(int n1,int n2,int base)
	{
		int mn1 = 0;
		int mn2 = 0;
		
		return getSum(mn1,mn2,base);
				
	}
	
	public static int getSum(int num1,int num2,int base)
	{    
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter a 2 number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter a base number : ");
		int base = sc.nextInt();
		
		System.out.println(getMultiply(n1,n2,base));
	}

}
