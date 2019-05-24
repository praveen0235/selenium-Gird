package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\WorkSpace\\WebTable\\src\\main\\java\\featureFile\\ffile.feature",glue= {"StepDefinition"},
dryRun = false,format = {"pretty","html:target/cucumber"},monochrome = true)

public class Run {

}
