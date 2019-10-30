package Steps;

import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.VerifyPage;
import Utility.BrowserUtili;
import Utility.ConfigurationReader;
import Utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class LoginPageStep {

    String code = "";
    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);
        loginPage.signInButton.click();
        System.out.println("Oh MY test passed");
    }

    @Then("Registered user homepage should be displayed")
    public void registered_user_homepage_should_be_displayed() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Manage Your Profile");

    }

    @Then("User Profile name should be {string}")
    public void user_Profile_name_should_be(String username) {
        ProfilePage profilePage = new ProfilePage();
        Assert.assertEquals(profilePage.userName.getText(),username );
    }

    @Then("User get step verifaction code from email and Enter verifacition code")
    public void user_get_step_verifaction_code_from_email_and_Enter_verifacition_code() {
        BrowserUtili.openNewTab();
        ArrayList<String> tabs = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(1));
        Driver.getDriver().get("https://gmail.com");

        VerifyPage verifyPage = new VerifyPage();
        verifyPage.emailField.sendKeys("juratelzat@gmail.com" + Keys.ENTER);
        BrowserUtili.wait(2);
        verifyPage.passwordField.sendKeys("daohaoqusi!@#4" + Keys.ENTER);
        BrowserUtili.wait(5);
        verifyPage.verifyEmail.click();
        BrowserUtili.wait(3);
        code = verifyPage.code.getText();
        Driver.getDriver().switchTo().window(tabs.get(0));
        verifyPage.verifyField.sendKeys(code);
        verifyPage.okButton.click();

    }
    @Then("two-step verifacation page should be displayed")
    public void two_step_verifacation_page_should_be_displayed() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Manage Your Profile");
    }
}
