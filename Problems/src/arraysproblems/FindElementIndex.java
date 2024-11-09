package arraysproblems;

import java.util.Scanner;

public class FindElementIndex {
	
	public static void getIndex(int[] arr ,int key)
	{
		
	   for(int i = 0;i<arr.length;i++)
	   {
		   if(arr[i] == key)
		   {
			   System.out.println("index is : " + i);
		   }
	   }
	   
	}

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a target key : ");
		int key = sc.nextInt();
		int[] arr = {12,34,11,0,22,10,20,40};
		getIndex(arr,key);
	}

}
