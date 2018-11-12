package amazon.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABaseclass {
	
	public static final String url="https://www.amazon.in/";
	
	public static WebDriver driver=null;
	
	
	public WebDriver getDriver() {
		return driver;	
	}
	
	public static void setDriver(WebDriver driver) {
		ABaseclass.driver=driver;
		
	}
	public void createLocalDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\DriverSetUp\\chromedriver.exe");
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}
	public void closeDriver() {
		//getDriver().close();
	}

}
