package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    /*
    * Webdriver
    * Props
    * Logs
    * ExtentReports
    * DB
    * Excel
    * Mailing
    */

    public static WebDriver driver;

    @BeforeSuite
    public void setUp(){

    }

    public void tearDown() {

    }
}
