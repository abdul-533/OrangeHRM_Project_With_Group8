package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddUserDisplaySteps {
    DialogContent dc=new DialogContent();

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
    @And("Click on Add button")
    public void clickOnAddButton() {
        dc.clickFunction(dc.addBtn);
    }

    @Then("Check add user is displayed")
    public void checkAddUserIsDisplayed() {
        wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser"));
        wait.until(ExpectedConditions.elementToBeClickable(dc.saveBtn));
        Assert.assertTrue(dc.addUser.isDisplayed());
    }
}
