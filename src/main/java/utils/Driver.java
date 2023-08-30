package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    // Returns driver object
    public static WebDriver getInstance() {
        if (driver == null) {
            driver = createDriver();
        }
        return driver;
    }

    private static WebDriver createDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Dev\\CucumberFramework\\src\\test\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    // Quits the driver
    public static void quit() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }
}