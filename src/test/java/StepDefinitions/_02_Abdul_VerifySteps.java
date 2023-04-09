package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class _02_Abdul_VerifySteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("I navigate to Admin,User Management page")
    public void iNavigateToAdminUserManagementPage() {
        ln.clickFunction(ln.getWebElement("admin"));

    }

    @And("I click on Add button")
    public void iClickOnAddButton() {
        dc.clickFunction(dc.getWebElement("addBtn"));
    }

    @And("I verify that all the required elements are displayed")
    public void iVerifyThatAllTheRequiredElementsAreDisplayed() {
        SoftAssert _softAssert = new SoftAssert();

        for (WebElement e : dc.elements) {
            _softAssert.assertTrue(e.isDisplayed());
            //Assert.assertTrue(e.isDisplayed());
        }
        _softAssert.assertAll();

    }
}
