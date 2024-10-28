package bitmanipulation;

import java.util.Scanner;

public class OddEven {
	
	public static boolean isOdd(int n)
	{
		return (n&1)==1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(isOdd(n))
		{
			System.out.println("Odd Number");
		}else System.out.println("Even Number");
	}

}
