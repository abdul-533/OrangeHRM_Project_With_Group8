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

//    @FindBy(xpath = "//div[@class='oxd-select-wrapper']")//
//    private WebElement userRole;
//
//    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")//
//    private WebElement status;
//
//    @FindBy(xpath = "//div[@class='oxd-autocomplete-wrapper']")//
//    private WebElement employeeName;
//
//    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")//
//    private WebElement userNameInput;
//
//    @FindBy(xpath = "//input[@type='password']")//
//    private WebElement passwordInput;
//
//    @FindBy(xpath = "(//input[@type='password'])[2]")//
//    private WebElement confirmPasswordInput;
//
//    @FindBy(xpath = "//button[text()=' Cancel ']")//
//    private WebElement cancelBtn;

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
//                return userRole;
//            case "status":
//                return status;
//            case "employeeName":
//                return employeeName;
//            case "userNameInput":
//                return userNameInput;
//            case "passwordInput":
//                return passwordInput;
//            case "confirmPasswordInput":
//                return confirmPasswordInput;
//            case "saveBtn":
//                return saveBtn;
//            case "cancelBtn":
//                return cancelBtn;
            case "addBtn":
                return addBtn;

        }

        return null;
    }


}
