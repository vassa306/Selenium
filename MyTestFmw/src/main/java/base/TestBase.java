package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


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
    public static FileInputStream fis;
    public static Properties config = new Properties();
    Properties OR = new Properties();

    @BeforeSuite
    public void setUp() throws IOException {
          if(driver==null){
              try {
                  fis = new FileInputStream
                          (System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
              }catch (FileNotFoundException e){
                   e.printStackTrace();
              }
              try {
                  config.load(fis);
              }catch(IOException e){
                  e.printStackTrace();
              }

              System.out.println(config.getProperty("browser"));
              try {
                  fis = new FileInputStream
                          (System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Or.properties");
              }catch (FileNotFoundException e){
                  e.printStackTrace();
              }
              try {
                  OR.load(fis);
              }catch(IOException e){
                  e.printStackTrace();
              }
                  //driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))
              System.out.println(config.getProperty("bmlBtn_CSS"));
          }
          if (config.getProperty("browser").equals("firefox")){
              WebDriverManager.firefoxdriver().setup();
              driver = new FirefoxDriver();
          } else if(config.getProperty("browser").equals("chrome")) {
              WebDriverManager.chromedriver().setup();
              driver = new ChromeDriver();
          }
            else if(config.getProperty("browser").equals("edge")) {
              WebDriverManager.edgedriver().setup();
              driver = new EdgeDriver();
          }
          driver.get(config.getProperty("testsiteurl"));
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

              }
          }
    }

    public void tearDown() {

    }
}
