package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class _04_NofiStepsofCan extends Parent {
    DialogContent dc=new DialogContent();

    @And("enter a value in to the username which was already taken")
    public void enterAValueInToTheUsernameWhichWasAlreadyTaken() {
        dc.clickFunction(dc.userRole);
        Actions aksiyon=new Actions(GWD.getDriver());
        aksiyon.keyDown(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyUp(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyDown(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyUp(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyDown(Keys.ENTER).build().perform();
        aksiyon.keyUp(Keys.ENTER).build().perform();

        dc.clickFunction(dc.Status);
        aksiyon.keyDown(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyUp(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyDown(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyUp(Keys.ARROW_DOWN).build().perform();
        aksiyon.keyDown(Keys.ENTER).build().perform();
        aksiyon.keyUp(Keys.ENTER).build().perform();

        dc.sendKeysFunction(dc.employeeName, "Odis Adalwin");
        dc.sendKeysFunction(dc.usernameAdd, "adalwinodis1234");

        GWD.Bekle(4);

    }

    @Then("verify that notification messages “Already exists” in red color displayed.")
    public void verifyThatNotificationMessagesAlreadyExistsInRedColorDisplayed() {
        Assert.assertTrue(dc.errorMessage.isDisplayed());
        //dc.verifyContainsTextFunction(dc.errorMessage,"Invalid , Already exists");
    }
}
// adalwinodis1234  =  Username
//ESS  = User Role
//Odis Adalwin =  Employename
//Disabled  = Status