package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.MaintenancePage;
import utilities.DriverManager;

public class MaintenanceSteps {
    MaintenancePage maintenancePage = new MaintenancePage(DriverManager.getDriver().driver);

    @And("I set the password {string}")
    public void setPassword(String password) {
        maintenancePage.setPassoword(password);
    }

    @And("I click on the Confirm button")
    public void clickButton() throws InterruptedException {
        Thread.sleep(1000);
        maintenancePage.clickConfirmButton();
        Thread.sleep(1000);
    }

    @Then("We should be the page of Maintenance")
    public void titleDisplayed() throws InterruptedException {
        Thread.sleep(1500);
        Assertions.assertTrue(maintenancePage.isTitleDisplayed());
        Thread.sleep(1500);
    }

}
