package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _11_Notification_MessagesSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();



    @When("Click ADD button and enter the less password")
    public void clickADDButtonAndEnterTheLessPassword() {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.passwordAdd, "1234");
    }

    @Then("The error message should be displayed")
    public void theErrorMessageShouldBeDisplayed() {
        dc.verifyContainsTextFunction(dc.errorMessage, "least 8 characters");
        Assert.assertTrue(dc.errorMessage.isDisplayed());
    }
}
