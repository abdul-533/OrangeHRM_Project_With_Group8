package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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


    @FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement errorMessage;

    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
    public WebElement passInput;

    @FindBy(xpath="(//input[@type='password'])[2]")
    public WebElement passconfirmInput;

    @FindBy(xpath = "//ms-search-button//button")//
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")//
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")//
    public WebElement deleteDialogBtn;

    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;
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
}
