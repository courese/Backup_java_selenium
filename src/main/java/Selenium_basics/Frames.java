package Selenium_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	public void frameconcept()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		//WebDriverWait Driver = new WebDriverWait(driver,Duration.ofSeconds(60));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.findElement(By.xpath("//*[contains(@style,'#ff7295')]")).click();
//the element s not cliable and getting elemenet not found error coz the element is inside of the frame(use //iframe com) if it is inside of frame then we use only id, name and index locator		
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		for(int i=0;i<totalFrames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> existelement = driver.findElements(By.xpath("//*[contains(@style,'#ff7295')]"));
			if(existelement.size()>0)
			{
				driver.findElement(By.xpath("//*[contains(@style,'#ff7295')]")).click();
				driver.switchTo().defaultContent(); //switch back to the frame
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames s = new Frames();
		s.frameconcept();

	}

}
