package Selenium_basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MouseandKeyboard {
	public void mouseaction1() 
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.ebay.com");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']//parent::li"))).perform();
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Cameras and photos']//parent::li"))); 
		mouse.moveToElement(driver.findElement(By.xpath("//*[text()='Cameras and photos']//parent::li"))).click().perform();
	}
	
	public void mouseaction2() 
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("email"))).sendKeys("Maha").doubleClick().contextClick().perform();
	}
	
	public void mouseaction_draganddrop() 
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node06zvopc20h23911ygv3j0ikr72387754.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("form:drag_content"))).dragAndDrop((driver.findElement(By.id("form:drag_content"))), (driver.findElement(By.id("form:drop_header")))).perform();
	}
	
	public void Keyboard1() 
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("email"))).sendKeys("Maha").perform();
		mouse.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		mouse.keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB).perform();//shift+tab key is used to go back to the previous box
	}
	
	public void Keyboard2() throws Exception 
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("email"))).sendKeys("Maha").doubleClick().contextClick().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MouseandKeyboard s = new MouseandKeyboard();
		s.Keyboard2();

	}

}
