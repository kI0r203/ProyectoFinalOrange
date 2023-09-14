package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaintenancePage {

    WebDriver driver;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordTextBoxMaintenance;

    @FindBy(xpath = "(//button[@data-v-10d463b7])[2]")
    WebElement confirmButton;

    @FindBy(xpath = "//h6[text()='Purge Employee Records']")
    WebElement titlePage;

    public MaintenancePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setPassoword(String pass) {
        passwordTextBoxMaintenance.sendKeys(pass);
    }

    public void clickConfirmButton() {
        confirmButton.click();
    }

    public boolean isTitleDisplayed() {
        return titlePage.isDisplayed();
    }
}
