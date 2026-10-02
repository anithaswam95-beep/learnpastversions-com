package learnpastversions.comtestScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import learnpastversions.comtestbase.BaseTest;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void startBrowser() {
        setUp();
    }

    @Test
    public void verifyGoogleTitle() {

        String actualTitle = driver.getTitle();

        System.out.println("Page Title: " + actualTitle);
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}