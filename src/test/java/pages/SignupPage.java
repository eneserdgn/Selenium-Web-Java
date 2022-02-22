package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class SignupPage {

    private WebDriver driver;
    private ElementUtil elementUtil;

    // By Locators
    private By box_EmailSignUp = By.id("inputEmail");
    private By btn_SignUpOnSignUpPage = By.cssSelector(".ys-btn.ys-btn-primary.ys-btn-xlg.ys-btn-block.register-button");
    private By txt_FalseMail = By.xpath("[data-cv-field='Email']");


    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    // Page Actions
    public void checkTitle(String title) {
        Assert.assertEquals(title, elementUtil.getTitle());
    }

    public void typeEmailSignUpPage(String mail) {
        elementUtil.sendKey(box_EmailSignUp, mail);
    }

    public void clickSignUpButtonOnSignUpPage() {
        elementUtil.click(btn_SignUpOnSignUpPage);
    }

    public void checkFalseMailMessage(String message) {
        elementUtil.checkElementText(txt_FalseMail, message);
    }

}
