package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.LogOutPage;
import utilities.DriverManager;

public class LogOutSteps {

    LogOutPage logOutPage = new LogOutPage(DriverManager.getDriver().driver);

    @And("I click on drop down")
    public void clickOnDropDown(){
        logOutPage.clickOnDropDownButton();
    }

    @Then("I click on logout button")
    public void clickOnLogOut() throws InterruptedException {
        Thread.sleep(1000);
        logOutPage.clickOnLogOut();
    }
}
