package StepDefenition;



import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.WebDriverFile;
import Commons.WebDriverCommons;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.PropertyFileHandle;
import io.cucumber.java.en.*;

public class SearchPagesteps extends WebDriverFile{
	

@Given("Open the Browser and enter the URL")
public void open_the_browser_and_enter_the_url() throws InterruptedException 
{
    Launch();
    String url = PropertyFileHandle.propreaddata().getProperty("URL");
	driver.get(url);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
}

@When("Any popup Occurs please close that popup")
public void any_popup_occurs_please_close_that_popup() throws InterruptedException {
	WebDriverCommons E = new WebDriverCommons();
	driver.navigate().refresh();
	E.ClearPopups(driver);
}

@When("Select the From Location")
public void select_the_from_location() throws InterruptedException {
	test.log(LogStatus.INFO, "Sucessfully launched");
	SearchPage s = new SearchPage(driver);
	s.ClickFromLocation();
	s.SelectLocation("MAA");
	test.log(LogStatus.INFO, "Sucessfully selected the from Location as " +"MAA");
	
	
}

@When("Select the To Location")
public void select_the_to_location() throws InterruptedException {
	SearchPage s = new SearchPage(driver);
	s.ClickToLocation();
	s.SelectLocation("BOM");
	test.log(LogStatus.INFO, "Sucessfully selected the to Location as " +"BOM");
	
}

@When("Select the Date")
public void select_the_date() {
	SearchPage s = new SearchPage(driver);
	s.SelectADate("17");
	test.log(LogStatus.INFO, "Sucessfully selected the Date as " +"17");
	
}

@When("I Click On SearchButton")
public void i_click_on_search_button() {
	SearchPage s = new SearchPage(driver);
	s.ClickOnSearchButton();
	test.log(LogStatus.INFO, "Sucessfully clicked the search button ");
	
}

@When("I see OkGoIT popup Click onit")
public void i_see_ok_go_it_popup_click_onit() throws InterruptedException {
	SearchResultPage srp = new SearchResultPage(driver);
	srp.waitForOkayGotIt();
	test.log(LogStatus.INFO, "Sucessfully clicked the okGOtIT popup ");
	
}

@Then("Validate the search text with the expected Text")
public void validate_the_search_text_with_the_expected_text() {
	SearchResultPage srp = new SearchResultPage(driver);
	
	String searchResult = srp.WaitAndGetSearchText();
	SearchPage s = new SearchPage(driver);
	String screenshotPath= s.takescreenshot(driver);

	
	System.out.println(searchResult);
	s.ClickOnBackButton(driver);
	test.log(LogStatus.INFO, s.GetSearchResultValue());	
	test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));	

}
}
