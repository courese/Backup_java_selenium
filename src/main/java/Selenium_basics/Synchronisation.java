package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {
	public void open() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60)); //implicity wait method
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Mahalakshmi");;
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("maha2161996@gmail.com");
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(60)); //explicity wait method
		Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("reg_passwd__"))));
		driver.findElement(By.name("reg_passwd__")).sendKeys("pinky@231");
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Synchronisation s = new Synchronisation();
		s.open();

	}

}
