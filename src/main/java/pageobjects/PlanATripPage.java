package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utils.DriverFactory;

import java.io.IOException;

public class PlanATripPage extends DriverFactory {

    @Test
    public PlanATripPage goToGoCityBoston() throws IOException, InterruptedException {

        getDriver().get("https://gocity.com/boston/en-us/products/all-inclusive");
        driver.findElement(By.xpath("//*[@id=\"block-secondarylinks\"]/div/div/div/div/div/ul/li[4]/a")).click();
        Thread.sleep(3000);
        return new PlanATripPage();
    }

    @Test
    public PlanATripPage enterPersonalDetails() throws InterruptedException {
        driver.findElement(By.id("edit-first-name")).sendKeys("Chamara");
        driver.findElement(By.id("edit-last-name")).sendKeys("Fernando");
        driver.findElement(By.id("edit-email")).sendKeys("chamara778fernando@gmail.com");
        driver.findElement(By.id("edit-travel-date")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();
        Thread.sleep(3000);
        return new PlanATripPage();
    }

    @Test
    public PlanATripPage clickingOnPrivacyPolicy()  {

        driver.findElement(By.id("edit-subscription")).click();
        return new PlanATripPage();

    }

    @Test
    public PlanATripPage clickOnSubmitButton() throws InterruptedException {
        driver.findElement(By.id("edit-actions-submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.className("guidebook--download")).click();
        Thread.sleep(3000);
        driver.quit();
        return new PlanATripPage();
    }


}
