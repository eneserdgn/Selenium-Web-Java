package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.SignupPage;
import util.DriverFactory;

public class SignupPageSteps {

    private SignupPage signupPage = new SignupPage(DriverFactory.getDriver());
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user is on signUp page")
    public void isOnSignupPage() {
        loginPage.clickSignupButton();
    }

    @When("user enters email {string} on SignUp Page")
    public void sendKeyEmail(String mail) {
        signupPage.typeEmailSignUpPage(mail);
    }

    @When("user clicks SignUp Button on SignUp Page")
    public void clickSignUp() {
        signupPage.clickSignUpButtonOnSignUpPage();
    }

    @Then("user should see false mail message {string}")
    public void checkFailMessage(String message) {
        signupPage.checkFalseMailMessage(message);
    }


}
