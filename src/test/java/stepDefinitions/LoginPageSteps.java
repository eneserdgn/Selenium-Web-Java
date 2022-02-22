package stepDefinitions;

import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void isOnLoginPage() {
        loginPage.goLogin("isparta");
        loginPage.checkTitle("Isparta Online Yemek Siparişi, Paket Servis - Yemek Sepeti");

    }

    @When("user enters email {string}")
    public void entersEmail(String email) {
        loginPage.typeEmail(email);
    }

    @When("user enters password {string}")
    public void entersPass(String pass) {
        loginPage.typePassword(pass);
    }

    @When("user clicks on Login button")
    public void clicksLoginButton() {
        loginPage.clickLogin();
    }

    @When("user should see popup message {string}")
    public void shouldSeePageTitle(String message) {
        loginPage.checkPopupMessage(message);
    }

    @When("user click SignUp")
    public void userClickSignUp() {
        loginPage.clickSignupButton();
    }

    @Then("user should see empty mail message {string}")
    public void emptyMailMessage(String message) {
        loginPage.checkEmptyMailMessage(message);
    }

    @Then("user should see empty password message {string}")
    public void emptyPassMessage(String message) {
        loginPage.checkEmptyPasswordMessage(message);
    }

    @When("user clicks popup close button")
    public void userClicksPopupCloseButton() {
        loginPage.clickPopupClose();
    }

    @Then("user should see name {string}")
    public void checkName(String name) {
        loginPage.checkName(name);
    }

}
