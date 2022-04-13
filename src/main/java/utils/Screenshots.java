package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Screenshots extends ConfigWeb {

    public static String dateArchive() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("dd.MM.yyyy").format(ts);
    }

    public static String hourArchive() {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("hh-mm.ss").format(ts);
    }

    public static void MakeBorderSuccess(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '6px solid green'",
                element);
    }

    public static void MakeBorderFailed(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '6px solid red'",
                element);
    }

    public static void getPrint(WebDriver webdriver, String archive) {
        File screenshots = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshots, new File(archive));
        } catch (Exception error) {
            System.out.println("Não foi possível copiar e salvar o arquivo na pasta: " + error.getMessage());
        }
    }

}
