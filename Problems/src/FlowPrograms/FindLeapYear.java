package FlowPrograms;

public class FindLeapYear {
	
	public static void isLeapYear(int year)
	{
		 if(year%4==0) {
			  if(year%100==0) {
				   if(year%400==0) {
					   System.out.println("Leap Year");
				   }else
				   {
					   System.out.println("Not leap year");
				   }
			  }else
			  {
				  System.out.println("Leap year");
			  }
		 }else
		 {
			 System.out.println("Not leap year");
		 }
	}

	public static void main(String[] args) {
		
		isLeapYear(2004);
	}

}
