package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commons.WebDriverCommons;

public class SearchPage extends WebDriverCommons
{
	@FindBy (xpath="//*[@for='fromCity']")
	WebElement fromCity;
	@FindBy (xpath="//*[@for='toCity']")
	WebElement toCity;
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickFromLocation() throws InterruptedException
	{
		Thread.sleep(5000);
		//Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("//*[@for='fromCity']")));
		Explicitwaitforelementobeclickable(driver, fromCity);
		
		//driver.findElement(By.xpath("//*[@for='fromCity']")).click();
		fromCity.click();
	}
	
	public void ClickToLocation() throws InterruptedException
	{
		//Thread.sleep(5000);
		//Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("//*[@for='toCity']")));
		Explicitwaitforelementobeclickable(driver, toCity);
		
		//driver.findElement(By.xpath("//*[@for='toCity']")).click();
		toCity.click();
	}
	
	public void SelectLocation(String expectedLocation)
	{

		Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("(//*[@id='react-autowhatever-1']//li)[last()]")));
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
		for(int i=1;i<allElements.size();i++)
		{
			String actualLocation = driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]//div[contains(@class,'pushRight')]")).getText();
			if (expectedLocation.equalsIgnoreCase(actualLocation))
			{
				driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).click();
				break;
			}
				
		}
	}
	
	public void SelectADate(String dateToBeSelect)
	{
		Explicitwaitforpresencefelement(driver, By.xpath("(//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')]"));
		
		List<WebElement> AllDates = driver.findElements(By.xpath("(//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')]"));
		for(int i=1;i<=AllDates.size();i++)
		{
			String dateIsDisabled = driver.findElement(By.xpath("((//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')])["+i+"]")).getAttribute("class");
			if(!dateIsDisabled.contains("disabled"))
			{
				String actualDate = driver.findElement(By.xpath("((//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')])["+i+"]//p")).getText();
				if (actualDate.equalsIgnoreCase(dateToBeSelect))
				{
					driver.findElement(By.xpath("((//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')])["+i+"]")).click();
					break;
				}
			}
			
		}
	}
	
	public void ClickOnSearchButton()
	{
		driver.findElement(By.xpath("//*[text()='Search']")).click();
	}
	
	public String GetErrorMessageForSameCity()
	{
		List<WebElement> elementExist = driver.findElements(By.xpath("//*[@data-cy='sameCityError']"));
		if (elementExist.size() >0)
		{
		Explicitwaitforpresencefelement(driver, By.xpath("//*[@data-cy='sameCityError']"));
		return driver.findElement(By.xpath("//*[@data-cy='sameCityError']")).getText();
		}
		return "No Error Exist";
	}
	
	public String GetFromLocation()
	{
		Explicitwaitforpresencefelement(driver, By.xpath("//*[@id='fromCity']"));
		return driver.findElement(By.xpath("//*[@id='fromCity']")).getAttribute("value");
	}
	
	public String GetToLocation()
	{
		Explicitwaitforpresencefelement(driver, By.xpath("//*[@id='toCity']"));
		return driver.findElement(By.xpath("//*[@id='toCity']")).getAttribute("value");
	}
	
	public String GetSearchResultValue()
	{
		String finalResult = "Flights from "+GetFromLocation()+" to "+GetToLocation();
		return finalResult;
	}
	
}
