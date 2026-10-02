package learnpastversions.comtestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import learnpastversions.comtestutilities.ConfigReader;

public class BrowserLaunch {

    public static void main(String[] args) {

        String driverKey =
                ConfigReader.getProperty("edge.driver.key");

        String driverPath =
                ConfigReader.getProperty("edge.driver.path");

        String url =
                ConfigReader.getProperty("url");

        System.setProperty(driverKey, driverPath);

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get(url);

        System.out.println("Page Title: "
                + driver.getTitle());

        // Keep browser open for now
        // driver.quit();
    }
}