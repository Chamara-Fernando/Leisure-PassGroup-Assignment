package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import utils.DriverFactory;

import java.io.IOException;

public class PlanATripPage extends DriverFactory {

    public @FindBy(xpath = "//*[@id=\"block-secondarylinks\"]/div/div/div/div/div/ul/li[4]/a") WebElement link_planATrip;

    public PlanATripPage() {

    }


    @Test
    public PlanATripPage goToGoCityBoston() throws IOException, InterruptedException {

        getDriver().get("https://gocity.com/boston/en-us/products/all-inclusive");
        Thread.sleep(3000);
       // link_planATrip.click();
        driver.findElement(By.xpath("//*[@id=\"block-secondarylinks\"]/div/div/div/div/div/ul/li[4]/a")).click();
        driver.findElement(By.id("edit-first-name")).sendKeys("Chamara");
        driver.findElement(By.id("edit-last-name")).sendKeys("Fernando");
        driver.findElement(By.id("edit-email")).sendKeys("Fernando@gm.com");
        driver.findElement(By.id("edit-travel-date")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();
        driver.findElement(By.id("edit-subscription")).click();
        driver.findElement(By.id("edit-actions-submit")).click();



        return new PlanATripPage();
    }


}
