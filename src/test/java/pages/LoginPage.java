package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class LoginPage {

    private WebDriver driver;
    private ElementUtil elementUtil;

    // By Locators
    private By box_Email = By.id("UserName");
    private By box_Password = By.id("password");
    private By btn_Login = By.id("ys-fastlogin-button");
    private By txt_PopupMessage = By.cssSelector(".ys-xl.inner strong");
    private By btn_SignUp = By.cssSelector(".ys-userSettings a");
    private By txt_EmptyMail = By.xpath("[data-cv-field='UserName']");
    private By txt_EmptyPassword = By.xpath("[data-cv-field='Password']");
    private By txt_Name = By.id("ysUserName");
    private By btn_PopupClose = By.cssSelector(".modal-header-close");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    // Page Actions
    public void goLogin(String country) {
        driver.get("/" + country);
    }

    public void checkTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    public void typeEmail(String email) {
        elementUtil.sendKey(box_Email, email);
    }

    public void typePassword(String pass) {
        elementUtil.sendKey(box_Password, pass);
    }

    public void clickLogin() {
        elementUtil.click(btn_Login);
    }

    public void checkEmptyMailMessage(String message) {
        elementUtil.checkElementText(txt_EmptyMail, message);
    }

    public void checkEmptyPasswordMessage(String message) {
        elementUtil.checkElementText(txt_EmptyPassword, message);
    }

    public void checkPopupMessage(String message) {
        elementUtil.checkElementText(txt_PopupMessage, message);
    }

    public void clickSignupButton() {
        elementUtil.click(btn_SignUp);
    }

    public void clickPopupClose() {
        elementUtil.click(btn_PopupClose);
    }

    public void checkName(String name) {
        elementUtil.checkElementText(txt_Name, name);
    }


}
