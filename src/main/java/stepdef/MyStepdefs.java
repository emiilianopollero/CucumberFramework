package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import pages.GoogleHomePage;



public class MyStepdefs {

    GoogleHomePage googleHomePage = new GoogleHomePage();
    private final SoftAssert softAssert = new SoftAssert();

    @Given("^I navigate to Google homepage$")
    public void iNavigateToGoogleHomepage() {
        googleHomePage.open();
    }

    @When("I search for {string}")
    public void iSearchForSearchTerm(String searchTerm) {
        googleHomePage.searchForText(searchTerm);
    }

    @Then("I can see in the results the word {string}")
    public void iCanSeeInTheResultsTheWordSearchTerm(String resultText) {
        softAssert.assertTrue(googleHomePage.isTextInResults(resultText));
    }

    @After
    public void tearDown(){
        BasePage.driver.quit();
    }
}
