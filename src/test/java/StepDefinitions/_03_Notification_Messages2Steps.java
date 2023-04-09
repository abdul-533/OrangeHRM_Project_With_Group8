package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_Notification_Messages2Steps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @When("User a AdminPassword name as {string}")
    public void userACitizenShipNameAsShortNameAs(String name) {


        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.passInput,name);

    }
    @Then("Upper case message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.errorMessage,"Try a different password");
    }
}
