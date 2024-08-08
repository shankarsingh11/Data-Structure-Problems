package recursionproblems;

import java.util.*;

public class CountZero {
	// method 1
	
	public static int countzeros1(int n) {
		
		int count = 0;
		if(n==0) return 0;
		
		int rem = n%10;
		if(rem == 0) count++;
		
		return count+ countzeros1(n/10);
		 
		
	}
	
   // method 2
	
	public static int countzeros2(int n) {
		  
		return helper(n,0);
	}
	
	// helper method 
	
	public static int helper(int n, int c) {
		
		if(n==0) return c;
		int rem= n%10;
		if(rem==0) 
			 helper(n/10,c++);
		return helper(n/10,c);
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int ans = countzeros1(n);
		System.out.println("number of zeros is : " + ans);
		
		int res= countzeros2(n);
		System.out.println("number of zeros is : " + res);

	}

}
