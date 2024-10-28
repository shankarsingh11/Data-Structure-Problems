package FlowPrograms;

import java.util.Scanner;

public class TwoNumSum {
	
	public static int sum(int num1,int num2)
	{
		return num1+num2;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num to add");
		int num1= sc.nextInt();
		System.out.println("Enter 2nd num to add");
		int num2 = sc.nextInt();
		
		System.out.println("Sum is : "+ sum(num1,num2));

	}

}
