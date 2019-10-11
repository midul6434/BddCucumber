package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"} ,
       format = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml"},
        glue = "StepDefinitions",
        strict = false,
        monochrome = true,
        tags = {"@databases"},  //@SmokeTest, @FunctionalTest, @DocString,@exampletest,@logintest
        dryRun =false)

public class RunnerTest {

}

