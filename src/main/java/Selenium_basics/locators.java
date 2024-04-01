
package Selenium_basics;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public void open()
	{
		WebDriver name =new ChromeDriver(); //to open the chrome browser
		name.manage().window().maximize(); // to mazimize or minimize the browser page
		name.get("https://www.facebook.com/");
		WebElement username = name.findElement(By.id("email"));
		//WebElement username = name.findElement(By.name("email"));
		//WebElement username = name.findElement(By.className("inputtext _55r1 _6luy"));
		username.sendKeys("Mahalakshmi");
		//username.clear();
		//name.findElement(By.linkText("Forgotten password?")).click();		
		//name.findElement(By.partialLinkText("password?")).click();

	}
	//nae, id, class - are to inspect the element. but link and partial link are not to inpect and it is for clicking the links
		// if we perform more than one action then we use webelement and clear the elements
		// if we perform only one action we can write direct code without using webelement.
	public void linktextandCSS_locator()
	{
		WebDriver driver =new ChromeDriver(); //to open the chrome browser
		driver.manage().window().maximize(); // to mazimize or minimize the browser page
		driver.get("https://www.facebook.com/");
		//WebElement username = driver.findElement(By.cssSelector("input#email")); // 1st type of CSS
		//WebElement username = driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")); //2nd type of CSS
		//WebElement username = driver.findElement(By.cssSelector("input[data-testid='royal_email']")); //3rd type of CSS
		WebElement username = driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[data-testid='royal_email']"));//4th type of CSS
		username.sendKeys("Mahalakshmi");
		username.clear();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("word")).click();
	}
	public void XpathandXpathaxes_locator()
	{
		WebDriver driver =new ChromeDriver(); //to open the chrome browser
		driver.manage().window().maximize(); // to mazimize or minimize the browser page
		driver.get("https://www.facebook.com/");
		/*WebElement username = driver.findElement(By.xpath("//input[@data-testid='royal_email']")); //basic xpath
		username.sendKeys("Mahalakshmi");
		username.clear();*/
		WebElement login = driver.findElement(By.xpath("//button[contains(@id,'u_0')]")); //contains xpath
		login.click();
		//WebElement login = driver.findElement(By.xpath("//button[starts-with(@data-testid,'royal')]"));//Starts-with xpath
		//WebElement login = driver.findElement(By.xpath("//input[contains(@class,'inputtext') and @id='email']")); //and xpath
		//WebElement login = driver.findElement(By.xpath("//input[starts-with(@class,'inputtext') or @id='email']")); //or xpath
		
		
		//WebElement login = driver.findElement(By.("//select[@aria-label='Day']//following::option)]"); //xpathaxes method using following
		//WebElement login = driver.findElement(By.("//select[@aria-label='Day']//child::option"); //xpathaxes method using child
		//WebElement login = driver.findElement(By.("//select[@aria-label='Day']//following-sibling::option"); //xpathaxes method using following-sibling
		//WebElement login = driver.findElement(By.("//select[@aria-label='Day']//descendant::option");//xpathaxes method using descendant
		//WebElement login = driver.findElement(By.("//span[@class='_5k_4']//ancestor::span");//xpathaxes method using ancestor
		//WebElement login = driver.findElement(By.xpath("//select[@aria-label='Day']//preceding::span"));//xpathaxes method using preceding
		//WebElement login = driver.findElement(By.("//select[@aria-label='Day']//parent::span");//xpathaxes method using parent
		
		
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		locators s = new locators();
		s.XpathandXpathaxes_locator();

	}

}
