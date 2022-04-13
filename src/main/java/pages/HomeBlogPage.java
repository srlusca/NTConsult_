package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigWeb;
import utils.Screenshots;

public class HomeBlogPage extends ConfigWeb {

    @FindBy(id = "search-open")
    private WebElement btnSearchOpen;

    @FindBy(xpath = "//*[@class='desktop-search']")
    private WebElement elementSearchField;

    @FindBy(xpath = "//div[@class='desktop-search']//input[@type='search']")
    private WebElement inputSearchField;

    @FindBy(xpath = "//div[@class='desktop-search']//input[@type='submit']")
    private WebElement btnSubmit;

    public HomeBlogPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickBtnSearchOpen() {
        btnSearchOpen.click();
    }

    public boolean isVisibleSearchField() {
        String screenshot = "src/main/resources/HomePage/" + Screenshots.dateArchive() + "/" + Screenshots.hourArchive() + " CampoSearch.png";
        if (elementSearchField.isDisplayed()) {
            Screenshots.MakeBorderSuccess(elementSearchField);
            Screenshots.getPrint(driver, screenshot);
            return true;
        };
        Screenshots.getPrint(driver, screenshot);
        return false;
    }

    public void setInputSearchField(String search) {
        String screenshot = "src/main/resources/HomePage/" + Screenshots.dateArchive() + "/" + Screenshots.hourArchive() + " CampoSearch.png";
        inputSearchField.sendKeys(search);
        Screenshots.MakeBorderSuccess(inputSearchField);
        Screenshots.MakeBorderSuccess(btnSubmit);
        Screenshots.getPrint(driver, screenshot);
    }

    public void clickBtnSubmit() {
        btnSubmit.click();
    }

}
