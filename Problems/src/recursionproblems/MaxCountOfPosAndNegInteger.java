package recursionproblems;


// leetcode problem - 2529
public class MaxCountOfPosAndNegInteger {
	
	public static int maximumCount(int[] nums) {
		
		return helper(nums,0,0,0);
		
	}
	
	public static int helper(int[] nums,int idx,int poscount,int negcount) {
		
		int pos = Integer.MAX_VALUE;
		int neg = Integer.MIN_VALUE;
		
		if(idx==nums.length) return Math.max(poscount,negcount);
		
		if(nums[idx]<pos && nums[idx]>0) {
			
			return helper(nums,idx+1,poscount++,negcount);
		}
		
			return helper(nums,idx+1,poscount,negcount++);
		
		
	}

	public static void main(String[] args) {
		
		int[] nums = {-2,-1,-1,1,2,3};
		int ans = maximumCount(nums);
		System.out.println(ans);
	}

}
