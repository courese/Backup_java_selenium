package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerttype {
	public void alertconcept() throws Exception
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0yauuyldo9chf1qskrn0oo6nrb385649.node0");
		//alert type - simple dailog alert
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']")).click();
		driver.switchTo().alert().accept();
		
		//alert type - confirm dailog alert
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']")).click();
		//driver.switchTo().alert().dismiss();
		Alert a = driver.switchTo().alert();
		a.dismiss();
		
		//alert type - Prompt dailog alert
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']")).click();
		Alert b = driver.switchTo().alert();
		String message = b.getText(); //to get the text used in the alert box
		b.sendKeys("DONE");
		b.accept();
		System.out.println(message);
		
		//alert type - sweet alert
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']")).click();
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt88:j_idt98']"))); // wait condition is to wait for the next element
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']")).click();
		
		//alert type - sweet confirmation alert
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt106']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt108']")).click();
		
		//alert type - sweet model alert
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='j_idt88:j_idt101'])//div//a[contains(@aria-label,'Close')]")).click();
		
	}
		

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Alerttype s = new Alerttype();
		s.alertconcept();

	}

}
