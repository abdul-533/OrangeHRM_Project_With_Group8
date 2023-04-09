package StepDefinitions;
import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Notification_MessagesSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Navigate to Admin page")
    public void navigateToAdminPage() {
        ln.clickFunction(ln.admin);

    }
    @When("User a AdminPassword name as {string} short name as {string}")
    public void userACitizenShipNameAsShortNameAs(String name, String shortName) {


        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.passInput,name);
        dc.sendKeysFunction(dc.passconfirmInput,shortName);

    }
    @Then("Error message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.errorMessage,"Passwords do not match");
    }
}
