package arraysproblems;

import java.util.Scanner;

public class SpanArray {
	
	public static int spanArray(int[] arr)
	{   
		int n  = arr.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<n;i++)
		{
			if(arr[i]<min) {
				min = arr[i];
			}else if(arr[i]>max) {
				 max = arr[i];
			}
		}
		
		int span = max-min;
		
		return span;
		
	}
	

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
      int [] arr = {6,1,30,40,2,11,9};
     int rs = spanArray(arr);
     System.out.println(rs);
	}

}
