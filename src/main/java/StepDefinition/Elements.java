package StepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Elements{
	
	@FindBy(xpath= ".//*[@class = 'tsc_table_s13']/tbody/tr[1]/td[1]")
	public static WebElement table;
	
	
	public Elements() 
	{
		try {
			Base.setup();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PageFactory.initElements(Base.driver, this);
	}

}
