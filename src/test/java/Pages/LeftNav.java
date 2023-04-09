package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/web/index.php/admin/viewAdminModule']")
    private WebElement admin;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "admin":
                return admin;

        }

        return null;
    }


}
