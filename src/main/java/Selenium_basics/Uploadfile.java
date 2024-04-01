package Selenium_basics;

import java.awt.AWTException;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Uploadfile {
	public void fileuploading() throws AWTException
	{
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize(); 
		//ChromeOptions c = new ChromeOptions();
		//c.addArguments("--disable-notifications");
		driver.get("https://smallpdf.com/compress-pdf");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//div[@class='sc-8s01yt-1 vma-Dc']//div[2]//span[contains(@class,'sc-8s01yt-5')]")).click();
		StringSelection str = new StringSelection("C:\\BDZ-CHN-SIS-20230514113038.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Uploadfile S = new Uploadfile();
		S.fileuploading();

	}

}
