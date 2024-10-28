package FlowPrograms;

import java.util.Scanner;

public class TestPrimeNum {
	
	public static boolean isPrimeNum(int num)
	{    
		 int c = 2;
		 
		 return helper(num,c);
		  
	}
	private static boolean helper(int num, int c) {
		  
		if(num<=2) {
			return (num==2)? true:false;
		}
		
		if(num%c==0) {
			return false;
		}
		
		if(c*c>num) return true;
		
		return helper(num,c+1);
	
		
	}
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    System.out.println(isPrimeNum(num));
	}

}
