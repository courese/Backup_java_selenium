package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_conversion2 {
	
	@BeforeMethod				//BeforeClass annotation will execute this method after completion of Beforetest
	public void BeforeClass()
	{
		System.out.println("BeforeClass in 3rd class");
	}
	
	@Test(groups = "Second")

	public void Testcase3()
	{
		System.out.println("testcases 3");
	}

}
