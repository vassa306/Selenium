package testcases;

import base.TestBase;
import io.qameta.allure.Description;
import org.apache.poi.hssf.record.TableRecord;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    public void loginIntoEshop(){
        driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
        Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("bmlBtn"))),"Login not successful");
        System.out.println("Login successfuly executed");
    }




    @Test(dataProvider="getData")
    @Description("Login Test of AutomationStore")
    public void registerIntoEshop(String firstName, String lastName, String Email, String telephone) throws InterruptedException {
        loginIntoEshop();
        driver.findElement(By.xpath(OR.getProperty("continueBtn"))).click();
        Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("continueBtn"))),"cannot open Registration page");
        driver.findElement(By.xpath(OR.getProperty("firsNameField"))).sendKeys(firstName);
        driver.findElement(By.xpath(OR.getProperty("lastNameFiel"))).sendKeys(lastName);






    }
    @DataProvider
    public Object [] [] getData(){
        String sheetName = "LoginTest";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object [] [] data = new Object[rows-1][cols];
            for (int rowNum = 2;rowNum<=rows;rowNum++){
                for (int colNum = 0; colNum < cols; colNum++){
                    data[rowNum -2][colNum] = excel.getCellData(sheetName,colNum,rowNum);
                }
            }
        return data;
    }
}

