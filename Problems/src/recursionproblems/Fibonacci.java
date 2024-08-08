package recursionproblems;

import java.util.*;

public class Fibonacci {
	
	public static int fib(int n) {
		// base condition
		if(n==1 || n==0) return n;
		// recursive call 
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(n + "th"+ " Fibonacci number is: "+fib(n));

	}

}
