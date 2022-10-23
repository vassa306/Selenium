package testcases;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void loginIntoEshop(){
        driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
        Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("bmlBtn"))),"Login not successful");
        System.out.println("Login successfuly executed");
    }
}

