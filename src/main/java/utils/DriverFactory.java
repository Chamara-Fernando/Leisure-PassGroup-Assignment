package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageobjects.PlanATripPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;
    public static PlanATripPage planATripPage;


    public WebDriver getDriver() {
        try {
            // read config
            Properties p = new Properties();
            FileInputStream fi = new FileInputStream(System.getProperty("user.dir") +
                    "\\src\\main\\java\\properties\\config.properties");
            p.load(fi);
            String browserName = p.getProperty("browser");

            switch (browserName) {
                case "firefox":
                    if (null == driver) {
                        // setup
                        System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        //capabilities.setCapability("marionete", true);
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                    }

                    break;

                case "chrome":

                    if (null == driver) {
                        // setup

                        System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                        // chrome options
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();

                    }

                    break;


            }

        } catch (Exception e) {
            System.out.println("Unable to load browser: " + e.getMessage());

        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            planATripPage = PageFactory.initElements(driver, PlanATripPage.class);

        }

        return driver;

    }
}
