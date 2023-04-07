package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {


    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "")
    public WebElement xxxx;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "xxxx":
                return xxxx;

        }

        return null;
    }


}
