package arraysproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleOccurencesKey {
	
 // Take a Argument as list ArrayList type 
	public static ArrayList<Integer> multiOccurances(int[] arr,int idx,int key,ArrayList<Integer> list)
	{
		if(idx == arr.length )return list;
		 
		if(key==arr[idx]) {
			list.add(idx);
			return multiOccurances(arr,idx+1,key,list);
		}
		
		return multiOccurances(arr,idx+1,key,list);
		
	}
	
	// Without Taking argument Arraylist but return a ArrayList type
	
	public static ArrayList<Integer> keyOccursnces(int[] arr,int idx,int key)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(idx == arr.length)return list;
		
		if(key==arr[idx]) {
			list.add(idx);
			 ans.addAll(list);
			 return KeyOccurances(arr,idx+1,key);
		}
		
		return KeyOccurances(arr,idx+1,key);
	}

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter Array size: ");
     int n = sc.nextInt();
     
     int[] arr = {2,4,5,6,4,9,10,4};
     int key = sc.nextInt();
     
     ArrayList<Integer> ans = new ArrayList<>();
     multiOccurances(arr,0,key,ans);
     System.out.println(ans);
     
     
     
	}

}
