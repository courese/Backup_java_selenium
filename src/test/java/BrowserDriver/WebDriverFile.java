package BrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utils.PropertyFileHandle;

public class WebDriverFile 
{

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	static String reportpath= System.getProperty("user.dir")+"\\Reports\\";
	
	public void Launch() throws InterruptedException
	{
		
		String broswerName = PropertyFileHandle.propreaddata().getProperty("Browser");
		 
		if(broswerName.equalsIgnoreCase("Edge"))
		{
		driver = new EdgeDriver();
		}
		else if(broswerName.equalsIgnoreCase("Chrome"))
		{
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		extenterportstart();
	}
	
	public void extenterportstart()
	{
		report = new ExtentReports(reportpath+"extentreport.html",false);
		test= report.startTest("Automation report");	
	}
	
	public void extentreportclose()
	{
		report.flush();
		
	}
}
