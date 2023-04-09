package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _03_VerifyRedMessage_Abdul {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("click to save button")
    public void clickToSaveButton() {
        dc.clickFunction(dc.getWebElement("saveBtn"));

    }

    @Then("Red notification message should be displayed")
    public void redNotificationMessageShouldBeDisplayed() {
        for (WebElement a : dc.required) {
            Assert.assertTrue(a.getCssValue("color").contains("235"));
        }

    }
}
