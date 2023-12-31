package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    @FindBy(className = "oxd-topbar-header-breadcrumb-module")
    WebElement dashboardText;
    @FindBy(xpath = "//span[text()='PIM']")
    WebElement pimLink;

    @FindBy(xpath = "//span[text()='Maintenance']")
    WebElement maintenanceLink;

    @FindBy(xpath = "//button[@title='Help']")
    WebElement helpButton;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean dashboardTitleIsDisplayed(){
        boolean dashboardTitleIsDisplayed = dashboardText.isDisplayed();
        return dashboardTitleIsDisplayed;
    }
    public void clickonPIMButton(){
        pimLink.click();
    }

    public void clickOnHelpButton() {helpButton.click();}

    public void clickOnMaintenance() {maintenanceLink.click();}

}
