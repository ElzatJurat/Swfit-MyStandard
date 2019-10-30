package Pages;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userid")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "sign-in")
    public WebElement signInButton;

}
