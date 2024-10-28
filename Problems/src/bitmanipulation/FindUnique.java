package bitmanipulation;

public class FindUnique {
	
	// XOR of all numbers 
	// a^0=a
	// a^a=0
	// a^1=(bar)a
	
	public static int ans(int[] arr)
	{  
		int unique=0;
		
		for(int n:arr) {
			unique ^=n;
		}
		
		return unique;
	}

	public static void main(String[] args) {
		
		int[] arr= {2,3,4,3,6,4,2};
		
		int res = ans(arr);
		System.out.println("Unique Element : "+res);

	}

}
