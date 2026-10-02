package learnpastversions.comtestbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import learnpastversions.comtestutilities.ConfigReader;

public class BaseTest {

    protected WebDriver driver;

    public void setUp() {

        String driverKey =
                ConfigReader.getProperty("edge.driver.key");

        String driverPath =
                ConfigReader.getProperty("edge.driver.path");

        String url =
                ConfigReader.getProperty("url");

        System.setProperty(driverKey, driverPath);

        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get(url);
    }

    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}