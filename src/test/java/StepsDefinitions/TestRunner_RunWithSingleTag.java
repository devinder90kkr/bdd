package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags/Tags.feature",
glue={"StepsDefinitions"},
// tags = "@smoke"
//tags = "(@smoke or @regression) and @important"  // Corrected to a single string
//tags ="@smoke or @regression"
//tags = "(@regression and not @smoke)"
//tags= "@smoke and @regression"
//tags = "(@smoke or @regression) and not @important"  
tags = "@mustRun"


// if run by using comand than need to mention as >>>>>  mvn test - Dcucumber.filter.tags="@smoke and @fast"


		)
public class TestRunner_RunWithSingleTag {

}
