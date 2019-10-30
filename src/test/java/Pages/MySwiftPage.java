package Pages;


import Utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MySwiftPage {

    public MySwiftPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='navbar-highlight dropdown-toggle'])")
    public WebElement myToolsButton;

    @FindBy(xpath = "(//div[@class='hlp-margin-b-l ng-scope'])[2]/ul/li")
    public WebElement myStandard;
}
