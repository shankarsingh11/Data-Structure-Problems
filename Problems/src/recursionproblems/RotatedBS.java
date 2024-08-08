package recursionproblems;

import java.util.*;

public class RotatedBS {
	
	public static int RBS(int[] arr,int s,int e,int target) {
		      if(s>e) return -1;
		      int mid = (s+e)/2;
		      if(target==arr[mid]) return mid;
		      
		      if(arr[s] < arr[mid])
		    	  if(target> arr[s] && target < arr[mid])
		    		  return RBS(arr,s,mid-1,target);
		      return RBS(arr,mid+1,e,target);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
           System.out.println("Enter the array size : ");
           int n = sc.nextInt();
           int[] arr = new int[n];
           int s = 0;
           int e = arr.length-1;
           System.out.println("Enter a target element : ");
           int target = sc.nextInt();
           
           System.out.println("Enter array elements : ");
           
           for(int i = 0;i<arr.length;i++) {
        	   arr[i]= sc.nextInt();
           }
           
           int ans = RBS(arr,s,e,target);
           System.out.println("Target index is : "+ans);
	}

}
