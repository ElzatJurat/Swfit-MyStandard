package Steps;

import Pages.MySwiftPage;
import Pages.ProfilePage;
import Utility.BrowserUtili;
import Utility.Driver;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class myStandardPageStep {

    @Then("user clicks on mySWIFT tab")
    public void user_clicks_on_mySWIFT_tab() {
        ProfilePage profilePage = new ProfilePage();
        profilePage.mySwift.click();
    }

    @Then("mySWIFT page should be displayed")
    public void myswift_page_should_be_displayed() {
        Assert.assertEquals("mySWIFT", Driver.getDriver().getTitle());
}

    @Then("user clicks on My tools dropdown")
    public void user_clicks_on_My_tools_dropdown() {
        MySwiftPage mySwiftPage = new MySwiftPage();
        mySwiftPage.myToolsButton.click();
    }

    @Then("User clicks on MyStandards")
    public void user_clicks_on_MyStandards() {
        MySwiftPage mySwiftPage = new MySwiftPage();
        mySwiftPage.myStandard.click();
    }

    @Then("MyStandard page should be displayed")
    public void mystandard_page_should_be_displayed() {
        BrowserUtili.wait(2);
        Assert.assertEquals("My Standards", Driver.getDriver().getTitle());
    }
}
