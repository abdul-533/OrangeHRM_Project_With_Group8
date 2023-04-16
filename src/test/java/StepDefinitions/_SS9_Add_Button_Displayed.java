package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class _SS9_Add_Button_Displayed {


    @Then("I get a success message that add button is displayed")
    public void iGetASuccessMessageThatAddButtonIsDisplayed() {
        DialogContent dc = new DialogContent();

      dc.elementIsDisplayed(dc.getWebElement("addBtn"));
    }
}
