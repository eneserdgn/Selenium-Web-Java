package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class LoginPage {

    private WebDriver driver;
    private ElementUtil elementUtil;

    // By Locators
    private By txtbox_email = By.id("UserName");
    private By txtbox_password = By.id("password");
    private By btn_loginButton = By.id("ys-fastlogin-button");
    private By txt_emptyMail = By.xpath("//input[@id='UserName']/../small");
    private By txt_emptyPass = By.xpath("//input[@id='password']/../small");
    private By txt_popupMessage = By.cssSelector(".ys-xl.inner strong");
    private By btn_popupButton = By.cssSelector(".confirmButton");
    private By btn_loginCloseButton = By.cssSelector(".modal-header-close");
    private By txt_userName = By.id("ysUserName");
    private By btn_signUp = By.cssSelector(".ys-userSettings a");
    private By txt_emailSignUpPage = By.id("inputEmail");
    private By btn_signUponSignUpPage = By.cssSelector(".register-button");
    private By txt_falseMailMessage = By.xpath("//input[@id='inputEmail']/../small");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    // Page Actions
    public String getLoginPageTitle() {
        return elementUtil.getTitle();
    }

    public void setEmail(String email) {
        elementUtil.sendKey(txtbox_email, email);
    }

    public void setPassword(String pass) {
        elementUtil.sendKey(txtbox_password, pass);
    }

    public void clickLoginButton() {
        elementUtil.click(btn_loginButton);
    }

    public void checkPopupMessage(String message) {
        elementUtil.checkElementText(txt_popupMessage, message);
    }

    public void checkEmptyMail(String message) {
        elementUtil.checkElementText(txt_emptyMail, message);
    }

    public void checkEmptyPass(String message) {
        elementUtil.checkElementText(txt_emptyPass, message);
    }

    public void clickPopupButton() {
        elementUtil.click(btn_popupButton);
    }

    public void clickPopupCloseButton() {
        elementUtil.click(btn_loginCloseButton);
    }

    public void checkName(String name) {
        elementUtil.checkElementText(txt_userName, name);
    }

    public void clickSignUp() {
        elementUtil.click(btn_signUp);
    }

    public void setSignUpEmail(String name) {
        elementUtil.sendKey(txt_emailSignUpPage, name);
    }

    public void clickSignUpButton() {
        elementUtil.click(btn_signUponSignUpPage);
    }

    public void checkFalseMailMessage(String message) {
        elementUtil.checkElementText(txt_falseMailMessage, message);
    }

}
