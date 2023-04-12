package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

// POM : Page Object Model
public class DialogContent extends Parent {


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()=' Login ']")
    private WebElement loginBTN;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    private WebElement loginSuccess;

    @FindBy(xpath = "//button[text()=' Save ']")//
    private WebElement saveBtn;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']//i")//
    private WebElement addBtn;

    @FindBy(xpath = "//*[contains(@class, 'oxd-form')]")//
    public List<WebElement> elements;

    @FindBy(xpath = "//span[text()='Required']")//
    public List<WebElement> required;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "userName":
                return username;
            case "password":
                return password;
            case "login":
                return loginBTN;
            case "loginSuccess":
                return loginSuccess;
            case "userRole":
            case "addBtn":
                return addBtn;

        }

        return null;
    }


}
