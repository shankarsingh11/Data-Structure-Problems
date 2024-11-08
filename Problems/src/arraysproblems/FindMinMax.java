package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;


class Pair
{
 private static long min;
  private static long max; 
  
  Pair(long min , long max){
	  this.min = min;
	  this.max = max;
  }

public static long getMin() {
	return min;
}

public static void setMin(long min) {
	Pair.min = min;
}

public static long getMax() {
	return max;
}

public static void setMax(long max) {
	Pair.max = max;
}
  
  
}

public class FindMinMax {
	
	  public static Pair getMinMax(int[] arr)
	  {  
		  Arrays.sort(arr);
		  int e = arr.length-1;
	      long mn= arr[0];
		  long mx = arr[e];
	      return (new Pair(mn,mx));
		
	  }
	  	
	// Naive Approach T.C = O(n), S.C = O(1)
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		for(int e: arr)
		{
			if(max<e)
			{
				max=e;
			}
			
		}
		
		return max;
	}
	
	public static int getMin(int[] arr)
	{
		int min = arr[0];
		for(int e: arr)
		{
			if(min>e)
			{
				min=e;
			}
			
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {23,12,2,11,4,40,1,9,5};
		
		// System.out.println("Minimum element is : " + getMin(arr));
		// System.out.println("Maximum element is : " + getMax(arr));
		
		Pair minmax = getMinMax(arr);
		
		System.out.println("Minimum element is : " + minmax.getMin());
		System.out.println("Maximum element is : " + minmax.getMax());
		

	}

}
