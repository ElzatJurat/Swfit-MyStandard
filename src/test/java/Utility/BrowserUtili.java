package Utility;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtili {

    public static void openNewTab() {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('about:blank','_blank');");
    }

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
