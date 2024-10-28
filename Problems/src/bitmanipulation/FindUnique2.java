package bitmanipulation;

public class FindUnique2 {
	
	// Add a all numbers
	private static int ans(int[] arr) {
		int uniqueNo=0;
		
		for(int n :arr) {
			uniqueNo +=n;
		}
		
		return uniqueNo;
	}

	public static void main(String[] args) {
		
		int[] arr = {-2,3,2,4,-5,5,-4};
		
		int res = ans(arr);
		System.out.println(res);

	}

	

}
