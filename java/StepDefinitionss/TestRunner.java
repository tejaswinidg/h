package StepDefinitionss;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitionss"},monochrome=true ,plugin= {"pretty","json:target/cucumber.json"})
public class TestRunner {

}
