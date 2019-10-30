package Pages;

import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage {
    public VerifyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "frmMain:twoSVVerification:twoFACodeId")
    public WebElement verifyField;

    @FindBy(id = "frmMain:twoSVVerification:cmdVerifyCodeIdm")
    public WebElement okButton;

    @FindBy(id = "identifierId")
    public WebElement emailField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(xpath = "(//table[@class='F cf zt'])/tbody/tr[1]")
    public WebElement verifyEmail;

    @FindBy(xpath = "(//div[@class='a3s aXjCH '])/h3")
    public WebElement code;
}
