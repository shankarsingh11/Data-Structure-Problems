package recursionproblems;

import java.util.*;

public class DigitSum {

	public static int digitSum(int n) {
		
		// base condition
		if(n%10 == n) return n;
		// recursive work or call 
		return (n%10) + digitSum(n/10);
	}
	
public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Digit Sum is : " + digitSum(num));
		
	}

}
