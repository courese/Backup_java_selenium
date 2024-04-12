package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Dropdown_checkbox_Radiobutton {
	public void mail(String expectedvalue)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]//div[contains(@class,'ui-chkbox-box')]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]//div[contains(@class,'ui-chkbox-box')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 String text =driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]//div[contains(@class,'ui-chkbox-box')]")).getAttribute("class");
		if(text.contains("ui-state-active"))
		{
			System.out.println("the ckeckbox is clicked");
		}
		driver.findElement(By.xpath("(//*[@id=\"j_idt87:basic\"]//div[contains(@class,'ui-chkbox-box')])[1]")).click();
		driver.findElement(By.xpath("(//*[@id=\"j_idt87:basic\"]//div[contains(@class,'ui-chkbox-box')])[3]")).click();
		
		//list concept
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		List<WebElement> AllValues = driver.findElements(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li"));
		int size = AllValues.size(); // it will give the total count of allvalues object
 		for(int i=1;i<+size;i++) // for condition here used is to iterating all values
 		{
 			String values = driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li["+i+"]")).getAttribute("data-item-value"); //+i+ is used to reach the respective rows in the list 
			//get attribute is used to get the runtime values and stored in the string named as values
 			if(values.equalsIgnoreCase(expectedvalue))
 			{
				driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-items-wrapper')]//ul//li["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
 				break;
		}
		driver.findElement(By.xpath("//*[contains(@class,'ui-icon-circle-close')]")).click();
		}
	}

	public void dropdown()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Select s = new Select (driver.findElement(By.xpath("//select[@name='birthday_day']")));
	    s.selectByIndex(20);	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown_checkbox_Radiobutton m = new Dropdown_checkbox_Radiobutton();
		//m.mail("London");
		m.dropdown();

	}

}
