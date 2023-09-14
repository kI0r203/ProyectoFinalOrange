package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {

    WebDriver driver;
    @FindBy(id = "main-content")
    WebElement titleHelp;

    public HelpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isTitleHelpDisplayed () {return titleHelp.isDisplayed();}
}
