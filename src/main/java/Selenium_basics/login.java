package Selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public void open()
	{
		WebDriver driver =new ChromeDriver(); //to open the chrome browser
		driver.manage().window().maximize(); // to mazimize or minimize the browser page
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("maha2161996@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("pink@213");
		username.clear();
		password.clear();
		//WebElement button = driver.findElement(By.name("login"));
		//button.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login s = new login();
		s.open();

	}

}
