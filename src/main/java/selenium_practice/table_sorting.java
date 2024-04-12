package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class table_sorting {
	public void sort(String Expectedcountryname) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node0twdqvu4bx0ngr5skywg5k1hm389682.node0");
		List<WebElement> rec = driver.findElements(By.xpath("//*[@class=\"ui-datatable-scrollable-body\"]//table//tbody//tr"));
		for(int i =1;i<=rec.size();i++)
		{
			String countryname = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr[\"+i+\"]//td[2]//span[contains(@style,'vertical-align')]")).getText(); 
			if (Expectedcountryname.equalsIgnoreCase(countryname))
			{
				String Representative = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr[\"+i+\"]//td[3]//span[contains(@style,'vertical-align')]")).getText();
				System.out.println(Representative);
			}
			
		}
				}
	public void status(String country_name)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node0twdqvu4bx0ngr5skywg5k1hm389682.node0");
		List<WebElement> total = driver.findElements(By.xpath("//*[@class=\"ui-datatable-scrollable-body\"]//table//tbody//tr"));
		for(int i=1;i<=total.size();i++)
		{
			String sets = driver.findElement(By.xpath("//*[@class=\"ui-datatable-scrollable-body\"]//table//tbody//tr["+i+"]//td[5]//span[contains(@style,'vertical-align')]")).getText();
			if(country_name.equalsIgnoreCase(sets))
			{
				String output = driver.findElement(By.xpath("//*[@class=\"ui-datatable-scrollable-body\"]//table//tbody//tr["+i+"]//td[5]//span[contains(@style,'vertical-align')]")).getText();
				System.out.println(output);
			}
		}
		
	
	}
	
	public static void main(String[] args) throws Exception {
		table_sorting s = new table_sorting();
		s.sort("stephen shaw");
		s.status("Italy");
	}

}
