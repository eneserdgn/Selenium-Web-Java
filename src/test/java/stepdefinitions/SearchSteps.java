package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;
import utils.DriverManager;

public class SearchSteps {
    SearchPage searchPage = new SearchPage(DriverManager.getDriver());

    @Given("I am on the Search Page")
    public void ıAmOnTheSearchPage() {
        searchPage.checkGoogleIcon();
    }

    @Then("I should see search box on Search Page")
    public void ıShouldSeeSearchBoxOnSearchPage() {
        searchPage.checkSearchBox();
    }

    @When("I enter {string} in the search box on Search Page")
    public void ıEnterInTheSearchBoxOnSearchPage(String text) {
        searchPage.sendKeysSearchBox(text);
    }

    @Then("I should see listbox on Search Page")
    public void ıShouldSeeListboxOnSearchPage() {
        searchPage.checkListBox();
    }

    @And("I click {string} button on Search Page")
    public void ıClickButtonOnSearchPage(String button) {
        searchPage.clickListBoxButtons(button);
    }
}
