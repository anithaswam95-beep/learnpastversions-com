package learnpastversions.comtestScripts;

import learnpastversions.comtestutilities.ConfigReader;

public class Sample {

    public static void main(String[] args) {

        System.out.println("Driver Key: "
                + ConfigReader.getProperty("edge.driver.key"));

        System.out.println("Driver Path: "
                + ConfigReader.getProperty("edge.driver.path"));

        System.out.println("URL: "
                + ConfigReader.getProperty("url"));
    }
}
