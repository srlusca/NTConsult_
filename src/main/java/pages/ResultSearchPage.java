package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigWeb;
import utils.Screenshots;

public class ResultSearchPage extends ConfigWeb {

    public ResultSearchPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean getResultsSearch(String search) {
        String screenshot = "src/main/resources/HomePage/" + Screenshots.dateArchive() + "/" + Screenshots.hourArchive() + " ResultadoDaBusca.png";
        WebElement resultSearch = driver.findElement(By.xpath("//span[(text()= '" + search + "')]"));
        if (resultSearch.getText().equals(search)) {
            Screenshots.MakeBorderSuccess(driver.findElement(By.xpath("//span[(text()= '" + search + "')]")));
            Screenshots.getPrint(driver, screenshot);
            return true;
        }
        Screenshots.MakeBorderFailed(driver.findElement(By.xpath("//h1//span[contains(text(), '')]")));
        Screenshots.getPrint(driver, screenshot);
        return false;
    }

}
