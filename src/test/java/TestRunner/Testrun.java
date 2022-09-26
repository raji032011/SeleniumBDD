package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		 plugin = {"pretty", "html:target/cucumber.html"},
		monochrome = true, // single color console output
//		tags = "@tag",//executing testcases
//		 features =
//		 {"C:\\Users\\nmanj\\Documents\\workspace-STS-4-4.13.0\\SeleniumBDD\\Features"},

		features = "C:\\Users\\nmanj\\Documents\\workspace-STS-4-4.13.0\\SeleniumBDD\\src\\test\\resources\\Features", dryRun = false, glue = {
				"StepDefinition", "Hooks" })

public class Testrun {

}
