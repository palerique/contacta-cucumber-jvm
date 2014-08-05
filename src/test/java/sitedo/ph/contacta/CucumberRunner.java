package sitedo.ph.contacta;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber",
		"rerun:target/rerun.txt" })
public class CucumberRunner {
}
