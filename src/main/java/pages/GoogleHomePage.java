package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage{
    @FindBy(id = "APjFqb")
    private WebElement searchBox;
    @FindBy(css = "div#rso")
    private WebElement searchResults;
    @FindBy(id = "L2AGLb")
    private WebElement acceptCookiesButton;
    @FindBy(id = "gNO89b")
    private WebElement searchBtn;
    public GoogleHomePage(){
        PageFactory.initElements(driver, this);
    }

    public void open(){
        driver.get("http://www.google.com");
        acceptCookiesButton.click();
    }
    public void searchForText(String text){
        searchBox.clear();
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.RETURN);
    }

    public boolean isTextInResults(String text){
        return searchResults.getText().contains(text);
    }
}
