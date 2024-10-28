package FlowPrograms;

import java.util.Scanner;

public class PrintTable {
	
	public static void printTable(int num)
	{
	   	for(int i = 2;i<=num;i++) 
	   	{
	   		for(int j = 1;j<=10;j++) 
	   		{
	   		   System.out.println(i + " x "+ j+" = " + i*j + "  ");	
	   		}
	   		System.out.println();
	   	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		printTable(num);

	}

}
