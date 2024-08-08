package recursionproblems;

import java.util.*;

public class Factorial {
	
	public static int fact(int n) {
		if(n==1) return n;
		
		return n * fact(n-1);
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	
	System.out.println( num +" Factorial is :  " + fact(num) );

	}

}
