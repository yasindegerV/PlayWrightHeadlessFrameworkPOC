package com.virgosol.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@wipPlay",
        dryRun = false,
        features = "src/test/resources/features",
        glue = {"com/virgosol/stepImpl"},
        plugin = {"pretty",
                "junit:target/junitreport.xml",
                "json:target/jsonreport.json",
                "html:target/cucumber-reports"}
)

public class TestCukesRunnerPW {
}
