package Steps;

import Utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ggooglesteps {

    @Given("User should be on google homepage")
    public void user_should_be_on_google_homepage() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("User clicks search field and types spoon")
    public void user_clicks_search_field_and_types_spoon() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("spoon" + Keys.ENTER);

    }

    @Then("all spoons result should display")
    public void all_spoons_result_should_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
