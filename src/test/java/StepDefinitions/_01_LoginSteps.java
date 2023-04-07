package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();

    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("Enter valid username  as {string} and password as {string} and click login button")
    public void enterValidUsernameAsAndPasswordAsAndClickLoginButton(String admin, String password) {

        dc.sendKeysFunction(dc.getWebElement("userName"), admin);
        dc.sendKeysFunction(dc.getWebElement("password"), password);
        dc.clickFunction(dc.getWebElement("login"));
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("index"), "wrong choice");

    }
}
