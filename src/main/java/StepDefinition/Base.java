package StepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
	public static WebDriver driver=null;
	static String baseURL;
	static String nodeURL;
	
	public static void setup() throws MalformedURLException
	{
	/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRajendra\\Downloads\\geckodriver.exe");
	
	driver = new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.toolsqa.com/automation-practice-table/#");*/
		 baseURL = "https://www.toolsqa.com/automation-practice-table/#";
         nodeURL = "http://10.100.21.95:4444/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.firefox();
         capability.setBrowserName("firefox");
         capability.setPlatform(Platform.WINDOWS);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
         driver.get(baseURL);
	}
}
