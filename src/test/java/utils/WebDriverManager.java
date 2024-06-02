package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    private static WebDriver driver;

    @SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
        if (driver == null) {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");
       
            
            // Set Chrome options for headless mode
            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--headless");
//            options.addArguments("--window-size=1920,1080"); // Set window size
//            // Optional: Add verbose logging for ChromeDriver
            System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
            System.setProperty("webdriver.chrome.verboseLogging", "true");

            
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
