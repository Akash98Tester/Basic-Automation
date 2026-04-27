package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner2 {
	

	@CucumberOptions(
	    features = "src/test/resources/Features",
	    glue = "stepdefinitions"
		//new line
	)
	public class ParallelRunner extends AbstractTestNGCucumberTests {

	    @Override
	    @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	}
}
