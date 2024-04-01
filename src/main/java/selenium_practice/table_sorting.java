package selenium_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class table_sorting {
	public void sort() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml;jsessionid=node0twdqvu4bx0ngr5skywg5k1hm389682.node0");
		// to pull the header of teh column
		List<WebElement> headers = driver.findElements(By.xpath("//*[contains(@class,'ui-datatable-scrollable-header-box')]//table//th"));
		
		List<String>Columnames = new ArrayList<>();
	
	
	
	
	}
	
	
	
	public static void main(String[] args) throws Exception {
		table_sorting s = new table_sorting();
		s.sort();
	}

}
