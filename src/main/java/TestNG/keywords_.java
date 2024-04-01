package TestNG;

import org.testng.annotations.Test;

public class keywords_ {

	@Test(invocationCount=1,invocationTimeOut=60, groups={"First", "Second"}) // invocation count will execute the textcase no of times
												  // invocationtimeout will exceute the invocation testcases within the timelimit and cannot give invocation timeout separately

	public void Sub()
	{
		System.out.println("Subtraction");
		//throw new ArithmeticException("fail");
	}
	
	
		@Test(priority=1, enabled=true, description="simple", timeOut=60, groups = "First") //timeout parameter used to run the testcase within the timelimit otherwise it will throws an error
		public void Add() throws Exception
		{
			System.out.println("Addition");
			Thread.sleep(2000); // it will delay to excute the testcases
		}
		
		
		@Test(priority=0, dependsOnMethods="Sub")
		public void div()
		{
			System.out.println("division");
		}
}
