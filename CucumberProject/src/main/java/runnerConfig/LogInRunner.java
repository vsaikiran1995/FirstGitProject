package runnerConfig;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src\\main\\java\\featureFiles",
	    tags={"@Smoke"},
	    glue="stepdefinitions")
public class LogInRunner {

}
