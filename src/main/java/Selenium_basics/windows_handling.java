package Selenium_basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
public class windows_handling {
	public void windows()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		WebDriverWait Driver = new WebDriverWait(driver,Duration.ofSeconds(60));
		String parentwindow = driver.getWindowHandle(); // to get the current windows name
		driver.findElement(By.xpath("//*[text()='Open']//parent::button")).click();
		Set<String> AllWindow = driver.getWindowHandles(); // to get the all open broswer windows name
		System.out.println(AllWindow);
		for (String childwindow:AllWindow) // this loop is used to get the child wndows name one by one
		{
			if(!childwindow.equals(parentwindow))
			{
				driver.switchTo().window(childwindow);
				List<WebElement> eelementexist=driver.findElements(By.xpath("//*[@id='menuform:j_idt40']"));
				if (eelementexist.size()>0)
			{
				WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(60)); //explicity wait method
				Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='menuform:j_idt40']")));
				
				driver.findElement(By.xpath("//*[@id='menuform:j_idt40']")).click();
				driver.findElement(By.xpath("//*[text()='Check Box']//parent::a")).click();
				Wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")));
				driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")).click();
				driver.switchTo().window(parentwindow);
				//driver.quit();
				break;	
			}
			else
			{
				driver.switchTo().window(parentwindow);
			}
			}	
		}
		}
	public void Multiplewindows()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(60));
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']//span[contains(@class,'ui-button-text')]")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);
		for(String childwindow:Allwindows)
		{
			if (!childwindow.equals(parentwindow))
			{
				driver.switchTo().window(childwindow);
				List<WebElement> eelementexist=driver.findElements(By.xpath("//*[@id='menuform:j_idt40']"));
				if (eelementexist.size()>0)
				{
					driver.manage().window().maximize();
					//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofMillis(60));
					wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='menuform:j_idt40']")));
				
					driver.findElement(By.xpath("//*[@id='menuform:j_idt40']")).click();
					driver.findElement(By.xpath("//*[text()='Check Box']//parent::a")).click();
					wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")));
					driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")).click();
					//driver.switchTo().window(parentwindow);
					//driver.quit();
					break;	
				}
				else
				{
					driver.switchTo().window(parentwindow);
				}
				
				
				}
				
			}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		windows_handling s = new windows_handling();
		s.Multiplewindows();

	}

}
