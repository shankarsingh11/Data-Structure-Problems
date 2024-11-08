package Sorting;

import java.util.Arrays;

public class MergeSort {
	// In-Place MergeSort
	public static void mergesortInPlace(int[] arr,int s,int e)
	{
		if(e-s==1) return;
		
		int mid = (s+e)/2;
		 mergesortInPlace(arr,s,mid);
		 mergesortInPlace(arr,mid,e);
		
		 mergeInPlace(arr,s,mid,e);
	}
	public static void mergeInPlace(int[] arr,int s,int m,int e)
	{
		int[] mix = new int[e-s];
		int i = s;
		int j = m;
		int k = 0;
		
		while(i<m && j < e)
		{
			if(arr[i]<arr[j])
			{
				mix[k]=arr[i];
				i++;
			}else {
				mix[k]= arr[j];
				j++;
			}
			
			k++;
		}
		
		while(i<m)
		{
			mix[k]= arr[i];
			i++;
			k++;
		}
		
		while(j<e)
		{
			mix[k]= arr[j];
			j++;
			k++;
		}
		
		for(int l = 0;l<mix.length;l++) {
			arr[s+l]=mix[l];
		}
		
	}
	
	
	
	public static int[] mergesort(int[] arr)
	{
	     if(arr.length == 1) return arr;
	     
	     int mid = (arr.length)/2;
	     
		int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
		int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
		
	}
	
	public static int[] merge(int[] left,int[] right)
	{  
		int[] ans = new int[left.length + right.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int n1 = left.length;
		int n2 = right.length;
		
		while(i<n1 && j < n2)
		{
			if(left[i] < right[j])
			{
				ans[k++] = left[i++];
			}else
			{
				ans[k++] = right[j++];
			}
		}
		
		while(i<n1)
		{
			ans[k++] = left[i++];
		}
		
		while(j<n2)
		{
			ans[k++] = right[j++];
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
	    
		int[] arr = {3,5,1,6,2,0,4};
		int s = 0;
		int e = arr.length;
		mergesortInPlace(arr,0,e);
		//int [] res = mergesort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
