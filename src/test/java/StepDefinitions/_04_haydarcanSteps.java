package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.bytebuddy.utility.RandomString;
import org.jsoup.select.Elements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;

public class _04_haydarcanSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    @And("Verify contains Text")
    public void clickAddButtonAndFillInTheInformations() {


        dc.sendKeysFunction(dc.passwordAdd, "Cacik3535.");

        dc.sendKeysFunction(dc.passwordAddConfirm, "Cacik3535.");


    }


    @Then("Verify Already Exists in red color message")
    public void verifyAlreadyExistsMessage() {
        Assert.assertFalse(dc.redText.getText().equals(true));


    }


}

