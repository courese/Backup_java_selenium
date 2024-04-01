package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public void open()
	{
		WebDriver driver =new ChromeDriver(); //to open the chrome browser
		driver.manage().window().maximize(); // to mazimize or minimize the browser page
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("maha");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("pink@213");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		locators s = new locators();
		s.open();

	}

}
