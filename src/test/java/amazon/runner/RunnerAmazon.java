package amazon.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features",glue= "amazon/steps",
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:outputReport/report.html"},tags= {})


public class RunnerAmazon {
	@AfterClass
	public static void tearDown() {
		Reporter.loadXMLConfig(new File("src/test/resources/config/extent-config.xml"));
		
	}
	
}
