package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue={"StepsDefinitions"},
monochrome = true,
plugin = {"pretty","junit:target/JunitReports/report.xml"},
tags="@Smoketest"
		)
public class TestRunner {

}
