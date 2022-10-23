package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import java.util.Properties;


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
    public static Properties config = new Properties();
    Properties OR = new Properties();

    @BeforeSuite
    public void setUp(){

    }

    public void tearDown() {

    }
}
