package runners;




import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/features"}, glue= {
        "steps" }, monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})


public class MainRunner {



}

