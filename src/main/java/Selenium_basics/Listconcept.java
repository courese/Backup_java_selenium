package Selenium_basics;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listconcept {
	public void listconcept(String Enteredvalues) throws IOException
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String title = driver.getTitle(); //it is use dto get the title 
		System.out.println(title);
		String geturl = driver.getCurrentUrl(); // it is to get the current url for verification
		System.out.println(geturl);
		String domstructure = driver.getPageSource(); //it will give the domestructure details means F12
		System.out.println(domstructure);
		String text = driver.findElement(By.xpath("(//*[@id='j_idt87']//div[1]//h5)[7]")).getText(); //xpath is to take anyone of the element name eg:select multiple element in testleaf url 
		System.out.println(text);
		String windowname = driver.getWindowHandle();
		System.out.println(windowname);
		String windowsname = driver.getWindowHandle();
		System.out.println(windowsname);
	// if the tag name is select then it is a dropadown , if div or etc it is a list concept.	
		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		List<WebElement> AllValues = driver.findElements(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li")); // it is to get all the list values so that webelements is used here
 		int size = AllValues.size(); // it will give the total count of allvalues object
 		for(int i=1;i<=size;i++) // for condition here used is to iterating all values
 		{
 			String values = driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li["+i+"]")).getAttribute("data-item-value"); //+i+ is used to reach the respective rows in the list 
			//get attribute is used to get the runtime values and stored in the string named as values
 			if(values.equalsIgnoreCase(Enteredvalues))
 			{
 				driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
 				break;		
 			}
 		}
 		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-close')]")).click(); // to close the listing
	}
	public void mulistconcept(String[] Enteredvalue) throws IOException
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/checkbox.xhtml");
		for(int j=0;j<=Enteredvalue.length;j++)  // j loop is for selecting multiple values
		{
			String Enteredvalues = Enteredvalue[j];
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));	
		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		List<WebElement> AllValues = driver.findElements(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li")); // it is to get all the list values so that webelements is used here
 		int size = AllValues.size(); // it will give the total count of allvalues object
 		for(int i=1;i<+size;i++) // for condition here used is to iterating all values
 		{
 			String values = driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li["+i+"]")).getAttribute("data-item-value"); //+i+ is used to reach the respective rows in the list 
			//get attribute is used to get the runtime values and stored in the string named as values
 			if(values.equalsIgnoreCase(Enteredvalues))
 			{
 				driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
 				break;		
 			}
 		}
 		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-close')]")).click(); // to close the listing
	}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Listconcept s = new Listconcept();
		String[] city = {"Paris", "London", "Berlin"};
		s.listconcept("Berlin");

	}

}
