package cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Features/MakeMyTrip.feature"},
glue="StepDefenition",monochrome=true,publish=true,tags="@SIT")
public class TestRunner {

}



