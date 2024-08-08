package recursionproblems;

import java.util.*;

public class BinarySearchUsingRec {
	
	public static int bs(int[] arr,int s,int e ,int target) {
		
		if(s>e) return -1;
		
		if(s==e) {
			
            if(arr[s] == target){
            	return s;
            	}
            }
		
		int mid = (s+e)/2;
		
		if(target==arr[mid]) return mid;
		
		if(target < arr[mid]) {
			
			return bs(arr,s,mid-1,target);
		}
		
		return bs(arr,mid+1,e,target);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int s = 0;
		int e = arr.length-1;
		System.out.println("Enter array element : ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target element : ");
		int target = sc.nextInt();
		
		int ans = bs(arr,s,e,target);
		
		System.out.println("target element index is : " + ans);
	}

}
