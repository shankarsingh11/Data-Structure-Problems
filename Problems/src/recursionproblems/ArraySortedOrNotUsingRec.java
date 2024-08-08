package recursionproblems;

import java.util.*;

public class ArraySortedOrNotUsingRec {
	
	public static boolean isSorted(int[] arr,int idx) {
		  if(idx == arr.length-1) return true;
		     return arr[idx] < arr[idx+1] && isSorted(arr,idx+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter an array elements: ");
		
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean ans = isSorted(arr,0);
		 
		if(ans == true) {
			System.out.println("arrays is sorted");
		}else {
			System.out.println("array is not sorted");
		}
		
		

	}

}
