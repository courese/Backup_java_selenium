package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_concept {
	public void scrolls() throws Exception
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0yauuyldo9chf1qskrn0oo6nrb385649.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Scroll down vertically
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,150)");
		Thread.sleep(2000);
		
		//Scroll up vertically
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-50)");
		Thread.sleep(2000);

		//Scroll right horizontal
		JavascriptExecutor hr = (JavascriptExecutor)driver;
		hr.executeScript("window.scrollBy(50,0)");
		Thread.sleep(2000);
		
		//Scroll left horizontal
		JavascriptExecutor hl = (JavascriptExecutor)driver;
		hl.executeScript("window.scrollBy(-30,0)");
		Thread.sleep(2000);
		
		//Scroll Page-down vertically
		JavascriptExecutor PD = (JavascriptExecutor)driver;
		PD.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//Scroll Page-UP vertically
		JavascriptExecutor PU = (JavascriptExecutor)driver;
		PU.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement start = driver.findElement(By.xpath("//*[@id='form:j_idt119']//span[contains(@class,'ui-button-text')]"));
		PU.executeScript("arguments[0].scrollIntoView();", start);
		

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		scroll_concept s = new scroll_concept();
		s.scrolls();

	}

}
