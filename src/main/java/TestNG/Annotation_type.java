package TestNG;
import org.testng.annotations.*;

public class Annotation_type {
	
@BeforeSuite(alwaysRun=true)				//Beforesuite annotation will execute this method at the begining
	public void BeforeSuite()
	{
		System.out.println("1.BeforeSuite");
	}
	
@AfterSuite	(alwaysRun=true)				//Aftersuite annotation will execute this method at last
	public void AfterSuite()
	{
		System.out.println("2.AfterSuite");
	}
	
@BeforeTest	(alwaysRun=true)				//BeforeTest annotation will execute this method next after the Beforesuite
public void BeforeTest()
{
	System.out.println("3.BeforeTest");
}

@AfterTest(alwaysRun=true)					//AfterTest	 annotation will execute this method before the Aftersuite
public void AfterTest()
{
	System.out.println("4.AfterTest	");
}

@BeforeClass				//BeforeClass annotation will execute this method after completion of Beforetest
public void BeforeClass()
{
	System.out.println("5.BeforeClass");
}

@AfterClass				//AfterClass annotation will execute this method after completion of Beforeclass
public void AfterClass()
{
	System.out.println("6.AfterClass");
}

@BeforeMethod				//BeforeMethod annotation will execute this method before every testcases
public void BeforeMethod()
{
	System.out.println("7.BeforeMethod");
}

@AfterMethod				//AfterMethod annotation will execute this method after every testcases
public void AfterMethod()
{
	System.out.println("8.AfterMethod");
}

@Test

public void Testcase1()
{
	System.out.println("testcases 1");
}
@Test

public void Testcase2()
{
	System.out.println("testcases 2");
}

}
