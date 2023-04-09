package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.ResultPage;
import utils.DriverManager;

public class ResultSteps {
    ResultPage resultPage = new ResultPage(DriverManager.getDriver());

    @Then("I should see the Result Page")
    public void ıShouldSeeTheResultPage() {
        resultPage.checkResults();
    }
}
