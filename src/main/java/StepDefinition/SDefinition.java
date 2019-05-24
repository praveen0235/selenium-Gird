package StepDefinition;

import java.util.List;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SDefinition extends Base{
	
	
	@Test
	@Given("^Navigate to URL$")
	public void Navigate_to_URL()
	{
		Elements obj = new Elements();
	}
	
	@Test
	@Then("^find the number of rows$")
	public String find_the_number_of_rows() throws Throwable {
		String data = Elements.table.getText();
		return data;
	}
	@Test
	@Then("^print it on console$")
	public void print_it_on_console() throws Throwable {
		System.out.println(find_the_number_of_rows());
	}
	
}
