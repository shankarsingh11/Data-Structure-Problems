package recursionproblems;

import java.util.*;

public class ReverseNumber {
	
	 public static int  rev1(int n) {
		 
		    return helper2(n,0);
		 
	 }
	 // helper method for  method rev1
	 
	 public static int helper2(int n,int sum) {
		  if(n==0) return sum;
		  int rem = n%10;
		  sum = sum *10 + rem;
		  return helper2(n/10,sum);
	 }
	 
	 // reverse the number using recursion 
	 
	 public static int rev2(int n) {
		
		 int digit = (int)(Math.log10(n)) + 1;
		 return helper(n,digit);
		 
	 }
        
	 // helper method for method rev2
	 
	private static int helper(int n, int digit) {
		  if(n%10==n)
		return n;
		  
		int rem = n%10;
		
		return rem*(int)(Math.pow(10, digit-1)) + helper(n/10,digit-1);
	}
	
	// find a palindrome number 
	
	public static boolean ispalindrome(int n) {
       return  n == rev1(n);
	}
  
	 // main method 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :");
       int n = sc.nextInt();
       int res = rev1(n);
       System.out.println("reverse number is : " + res);
      int  ans =  rev2(n);
		System.out.println("Reverse number is : "+ans);
		
		boolean flag = ispalindrome(n);
		
		if(flag== true) {
			System.out.println("palindrome number ");
		}else {
			System.out.println("Not Palindrome number");
		}
		
	}

}
