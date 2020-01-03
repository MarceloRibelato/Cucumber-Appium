package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = {"@calculator"})

public class RunTest {

}
