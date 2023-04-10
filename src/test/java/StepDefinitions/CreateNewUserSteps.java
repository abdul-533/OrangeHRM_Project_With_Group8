package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CreateNewUserSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    String randomUsername= RandomString.make(8);
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(5));


    @Given("Navigate to OrangeHRM")
    public void navigateToOrangeHRM() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("Login as default informations")
    public void loginAsDefaultInformations() {
        dc.sendKeysFunction(dc.getWebElement("userName"), "Admin");
        dc.sendKeysFunction(dc.getWebElement("password"), "admin123");
        dc.clickFunction(dc.getWebElement("loginBTN"));

    }

    @And("Click on the Admin from leftnav")
    public void clickOnTheAdminFromLeftnav() {
        ln.clickFunction(ln.admin);
    }

    @And("Click add button and fill in the informations")
    public void clickAddButtonAndFillInTheInformations() {
        dc.clickFunction(dc.addBtn);


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

        dc.sendKeysFunction(dc.employeeName, "P");
        GWD.Bekle(3);
        dc.clickFunction(dc.listbox);


        dc.sendKeysFunction(dc.usernameAdd, randomUsername);

        dc.sendKeysFunction(dc.passwordAdd, "Cacik3535.");

        dc.sendKeysFunction(dc.passwordAddConfirm, "Cacik3535.");

        GWD.Bekle(4);

    }

    @And("Click Save button")
    public void clickSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.saveBtn));
        dc.clickFunction(dc.saveBtn);
    }

    @Then("Verify the new user is in the list")
    public void verifyTheNewUserIsInTheList() {
        wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers"));
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchBox));
        dc.sendKeysFunction(dc.searchBox,randomUsername);
        dc.clickFunction(dc.searchBtn);
        wait.until(ExpectedConditions.elementToBeClickable(dc.pencil));
        Assert.assertTrue(dc.pencil.isDisplayed());

    }
}
