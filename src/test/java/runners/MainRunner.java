package runners;



import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.File;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"src/test/java/features"}, glue= {
        "steps" }, monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})

public class MainRunner extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") +
                "\\src\\main\\java\\utils\\ReportsConfig.xml"));

    }

}

