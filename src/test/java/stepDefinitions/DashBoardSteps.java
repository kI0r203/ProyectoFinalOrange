package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.jupiter.api.Assertions;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverManager;

public class DashBoardSteps {
    DashboardPage darshBoard = new DashboardPage(DriverManager.getDriver().driver);

    @Given("I click on PIM")
    public void clickOnPIM() throws InterruptedException{
        Thread.sleep(1500);
        darshBoard.clickonPIMButton();
    }

    @And("I click on the Help button")
    public void clickHelp() throws InterruptedException {
        Thread.sleep(1500);
        darshBoard.clickOnHelpButton();}

    @And("I click on the Maintenance")
    public void clickMaintenance() throws InterruptedException {
        Thread.sleep(1500);
        darshBoard.clickOnMaintenance();
        Thread.sleep(1000);
    }

}
