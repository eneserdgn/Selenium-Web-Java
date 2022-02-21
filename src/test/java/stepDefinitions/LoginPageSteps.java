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
        loginPage.getLoginPageTitle();
    }

    @When("user enters email {string}")
    public void entersEmail(String email) {
        loginPage.setEmail(email);
    }

    @When("user enters password {string}")
    public void entersPass(String pass) {
        loginPage.setPassword(pass);
    }

    @When("user clicks on Login button")
    public void clicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @When("user should see popup message {string}")
    public void shouldSeePageTitle(String message) {
        loginPage.checkPopupMessage(message);
        loginPage.clickPopupButton();
    }

    @Then("user should see empty mail message {string}")
    public void emptyMailMessage(String message) {
        loginPage.checkEmptyMail(message);
    }

    @Then("user should see empty password message {string}")
    public void emptyPassMessage(String message) {
        loginPage.checkEmptyPass(message);
    }

    @When("user clicks popup close button")
    public void userClicksPopupCloseButton() {
        loginPage.clickPopupCloseButton();
    }

    @Then("user should see name {string}")
    public void checkName(String name) {
        loginPage.checkName(name);
    }

    @When("user click SignUp")
    public void userClickSignUp() {
        loginPage.clickSignUp();
    }

    @When("user enters email {string} on SignUp Page")
    public void userEntersEmailOnSignUpPage(String mail) {
        loginPage.setSignUpEmail(mail);
    }

    @When("user clicks SignUp Button")
    public void userClicksSignUpButton() {
        loginPage.clickSignUpButton();
    }

    @Then("user should see false mail message {string}")
    public void userShouldSeeFalseMailMessage(String message) {
        loginPage.checkFalseMailMessage(message);
    }
}
