package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

import java.util.List;
import java.util.TreeMap;

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

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement passInput;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement passconfirmInput;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']//i")//
    private WebElement addBtn;

    @FindBy(xpath = "//ms-search-button//button")//
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")//
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button[@type='submit']")//
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//*[contains(@class, 'oxd-form')]")//
    public List<WebElement> elements;

    @FindBy(xpath = "//span[text()='Required']")//
    public List<WebElement> required;


    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElement employeeName;

    @FindBy(xpath = "//div[text()='No Records Found']")
    public WebElement noRecords;

    @FindBy(xpath = "//span[text()='Invalid']")
    public WebElement invalid;

    //    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
//    public WebElement addBtn;
    @FindBy(xpath = "(//div[@tabindex='0'])[1]")
    //(//div[@tabindex='0'])[1]
    //(//div[@class='oxd-select-text-input'])[1]
    //(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]
    public WebElement userRole;
    @FindBy(xpath = "(//div[@tabindex='0'])[2]")
    public WebElement Status;

    @FindBy(xpath = "(//input[@autocomplete='off'])[1]")
    public WebElement usernameAdd;
    @FindBy(xpath = "(//input[@autocomplete='off'])[2]")
    public WebElement passwordAdd;
    @FindBy(xpath = "(//input[@autocomplete='off'])[3]")
    public WebElement passwordAddConfirm;
    //    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
//    public WebElement saveBtn;
    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]//div")
    public WebElement Ess;
    @FindBy(xpath = "//div[@role='listbox']")
    public WebElement listbox;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement searchBtn;

    @FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
    public WebElement pencil;

    @FindBy(xpath = "//h6[text()='Add User']")
    public WebElement addUser;

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
            case "addButton":
                return addButton;
            case "userRole":
            case "addBtn":
                return addBtn;
            case "saveBtn":
                return saveBtn;


        }

        return null;
    }


    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));

        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }

    public void elementIsDisplayed(WebElement elemet) {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        Assert.assertTrue(elemet.isDisplayed(), "Element isn't displayed!");


    }
}
