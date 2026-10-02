package learnpastversions.comtestbase;

public class BaseConstants {

    // Prevent instantiation of utility/constants class
    private BaseConstants() {}

    // File Paths
    public static final String CONFIG_FILE_PATH = "src/main/resources/config.properties";
    public static final String CHROMEDRIVER_PATH = "src/main/resources/drivers/chromedriver.exe";
    public static final String EDGEDRIVER_PATH = "src/main/resources/drivers/msedgedriver.exe";

    // Wait & Timeout Configurations (in seconds)
    public static final int IMPLICIT_WAIT_TIMEOUT = 10;
    public static final int EXPLICIT_WAIT_TIMEOUT = 15;
    public static final int PAGE_LOAD_TIMEOUT = 30;

    // Supported Browsers
    public static final String BROWSER_CHROME = "chrome";
    public static final String BROWSER_EDGE = "edge";
    public static final String BROWSER_FIREFOX = "firefox";
}




