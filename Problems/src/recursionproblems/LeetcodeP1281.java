package recursionproblems;

public class LeetcodeP1281 {
	
	public static int SubtractProductAndSumOfDigit(int n)
	{   int m=1;int s= 0;int r = 0;
		if(n!=0)
		{
			m *=n%10;
			s +=n%10;
			r = m-s;
		    SubtractProductAndSumOfDigit(n/10); 
		    return r;
		}else
		{
			return r;
		}
	}
	
	public static void main(String[] args) {
		int n = 123;
		int ans=SubtractProductAndSumOfDigit(n);
		System.out.println(ans);
 
	}

}
