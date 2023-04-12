package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_Notification_Messages {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to admin page")
    public void navigateToAdminPage() {
        ln.clickFunction(ln.admin);
    }

    @When("Click ADD button and enter the invalid admin name")
    public void clickADDButtonAndEnterTheInvalidAdminName() {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.employeeName, "çağla");
    }

    @Then("Warning messages should be displayed")
    public void warningMessagesShouldBeDisplayed() {
        dc.clickFunction(dc.noRecords);
        dc.verifyContainsTextFunction(dc.invalid, "Invalid");
    }
}
