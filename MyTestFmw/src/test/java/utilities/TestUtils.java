package utilities;

import base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;

public class TestUtils extends TestBase {

    public static void captureScreenshot(String s) throws IOException {
        Date date = new Date();
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d = formatter.format(date);
        String filename = "error_" +s.toLowerCase() + "-" + d.replace(":","_") + ".jpg";
        File pageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pageScreenshot, new File("./screenshot/" + filename));
    }

}
