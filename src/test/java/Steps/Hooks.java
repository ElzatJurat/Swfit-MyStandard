package Steps;

import Utility.APIRunner;
import Utility.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println("Im setting up the test from hooks class");
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // you can also add maximize screen here
        Driver.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed() && Driver.getDriverReference() != null){
            scenario.write("This is a test for reporting writing");
            final byte[] screenshot= ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        if(scenario.isFailed() && APIRunner.getJson() != null){
            scenario.write(APIRunner.getJson());
        }
    }

}
