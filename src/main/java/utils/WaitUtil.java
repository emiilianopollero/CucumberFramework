package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import pages.BasePage;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class WaitUtil extends BasePage {

    private static final int timeout = 60;
    private static final int tryEverySeconds = 1;
    private static final Wait<WebDriver> waiting = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(timeout))
            .pollingEvery(Duration.ofSeconds(tryEverySeconds))
            .ignoring(NoSuchElementException.class);

    //An expectation for checking an element is visible and enabled to click it
    public static void waitForElementToBeClickable(WebElement element) {
        waiting.until(elementToBeClickable(element));
    }

    //Wait until element is visible
    public static void waitForElementToBeVisible(WebElement element) {
        waiting.until(visibilityOf(element));
    }

}