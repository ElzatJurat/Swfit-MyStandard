package Pages;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "sw-logged-in")
    public WebElement userName;

    @FindBy(id = "frmMain:miMyPortal")
    public WebElement mySwift;

}
