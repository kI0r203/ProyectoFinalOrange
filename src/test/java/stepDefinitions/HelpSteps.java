package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.HelpPage;
import utilities.DriverManager;

import java.util.Set;

public class HelpSteps {

    HelpPage helpPage = new HelpPage(DriverManager.getDriver().driver);

    @Then("The title of Help page should be displayed")
    public void titleDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        String mainTab = DriverManager.getDriver().driver.getWindowHandle();
        Set<String> allTabs = DriverManager.getDriver().driver.getWindowHandles();
        for (String tab : allTabs) {
            if (!tab.equals(mainTab)) {
                DriverManager.getDriver().driver.switchTo().window(tab);

                Assertions.assertTrue(helpPage.isTitleHelpDisplayed());
                DriverManager.getDriver().driver.close();
            }
        }

    }
}
