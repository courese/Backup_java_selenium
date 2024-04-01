package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Commons.WebDriverCommons;

public class SearchResultPage extends WebDriverCommons{

	WebDriver driver;
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String WaitAndGetSearchText()
	{
		Explicitwaitforpresencefelement(driver, By.xpath("//*[contains(@class,'journey-title')]//span"));
		String actualResultText = driver.findElement(By.xpath("//*[contains(@class,'journey-title')]//span")).getText();
		return actualResultText;
	}

	public void waitForOkayGotIt() throws InterruptedException
	{
		Explicitwaitforpresencefelement(driver, By.xpath("(//div[@class='overlay']//span)[1]"));
		driver.findElement(By.xpath("(//div[@class='overlay']//span)[1]")).click();
	}
	


}
