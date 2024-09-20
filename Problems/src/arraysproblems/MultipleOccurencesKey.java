package arraysproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleOccurencesKey {
	
	// eg1
 // Take a Argument as list ArrayList type 
	public static ArrayList<Integer> multiOccurances1(int[] arr,int idx,int key,ArrayList<Integer> list)
	{
		if(idx == arr.length )return list;
		 
		if(key==arr[idx]) {
			list.add(idx);
			return multiOccurances1(arr,idx+1,key,list);
		}
		
		return multiOccurances1(arr,idx+1,key,list);
		
	}
	
	//eg2
	// Without Taking argument Arraylist but return a ArrayList type
	
	public static ArrayList<Integer> multiOccurances2(int[] arr,int idx,int key)
	{   
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// base condition
		if(idx == arr.length)return ans;
		
		if(key==arr[idx])
		{   
			list.add(idx);
		    ans.addAll(list);
			return multiOccurances2(arr,idx+1,key);
		}
		return multiOccurances2(arr,idx+1,key);
	}

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
//   System.out.println("Enter Array size: ");
//   int n = sc.nextInt();
     
     int[] arr={2,4,5,6,4,7,8,4};
     System.out.println("Enter Key Value: ");
     int key =4;
     
     // eg1
     ArrayList<Integer> ans = new ArrayList<>();
     System.out.println( multiOccurances1(arr,0,key,ans));
     
     // eg2
     ArrayList<Integer> rs = new ArrayList<>();
     rs = multiOccurances2(arr,0,key);
     System.out.println(rs);
     System.out.println(multiOccurances2(arr,0,key));
     
     
     
	}

}
