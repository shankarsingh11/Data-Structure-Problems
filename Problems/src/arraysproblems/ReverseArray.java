package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
	
	public static void displayArray(int[] arr)
	{
		
			System.out.println((Arrays.toString(arr)));
		
	}
	
	
	
	
//	Alternate Approach] Using Recursion – O(n) Time and O(n) Space
	
	public static int[] reverseArrayRec(int[] arr, int s,int e)
	{
	   if(s>=e) return arr;
	   
	   int temp = arr[s];
	   arr[s]= arr[e];
	   arr[e]= temp;
	   
	   return reverseArrayRec(arr,s+1,e-1);
	}
	
	public static int[]  reverseArray3(int[] arr)
	{
		int n = arr.length-1;
		return reverseArrayRec(arr,0,n);
	}
	
//	Expected Approach – 2] By Swapping Elements – O(n) Time and O(1) Space
	
	public static int[] reverseArray4(int[] arr)
	{
		int n = arr.length;
		
		for(int i = 0;i<n/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
			
		}
		
		return arr;
		
	}
	
	
//	Expected Approach – 1] Using Two Pointers – O(n) Time and O(1) Space
	
	public static int[] reverseArray2(int[] arr)
	{
		int s = 0;
		int e = arr.length-1;
		
		while(s<e)
		{
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e]= temp;
			
			// increment by 1
			s++;
			// Decrement by 1
			e--;
		}
		
		return arr;
	}
	

// Naive Approach] Using a temporary array – O(n) Time and O(n) Space
	public static int[] reverseArray1(int[] arr)
	{
		  int n = arr.length;
		  
		// Temporary array to store elements in reversed order
		  int[] temp = new int[n];
		  

	     // Copy elements from original array to temp in reverse order
		  for(int i = 0;i<arr.length;i++)
		  {
			  temp[i] = arr[n-i-1];
		  }
		  
		// Copy elements back to original array
		  for(int i = 0;i<arr.length;i++)
		  {
			  arr[i] = temp[i];
		  }
		  
		return arr;  
	}

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    
     int[] arr = {1,2,3,4,5};
     
     int s = 0;
     int e = arr.length-1;
     

    
     // Using Swapping Approach
       int [] ans =    reverseArray4(arr); 
     
     // Using Recursive Approach
    // int [] ans =    reverseArray3(arr); 
     
     // Using Two Pointer Approach
    //  int[] ans =  reverseArray2(arr);
     
     // Using Naive Approach
    // int[] ans =  reverseArray1(arr);
     
     displayArray(ans);
     
     
	}

}
