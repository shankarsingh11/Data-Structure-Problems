package arraysproblems;

import java.util.*;

public class ElementSum {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of array");
	 int n = sc.nextInt();
	 int sum = 0;
	 int[] arr = new int[n];
	 
	 System.out.println("Enter the Values : ");
	 
	 for(int i = 0;i<arr.length;i++) {
		 arr[i] = sc.nextInt();
	 }
	 for(int i = 0;i<arr.length;i++) {
		 sum += arr[i];
	 }
	 
	 System.out.println("Array Element Sum is : " + sum);

	}

}
