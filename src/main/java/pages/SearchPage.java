package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchPage {

    ElementHelper elementHelper;

    By googleIcon = By.cssSelector(".lnXdpd");
    By searchBox = By.cssSelector(".gLFyf");
    By listBox = By.xpath(" //*[@class=\"erkvQe\"] //ul[@role=\"listbox\"]");
    By listBoxButtons = By.cssSelector(".aajZCb center input");


    public SearchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkGoogleIcon() {
        elementHelper.checkElement(googleIcon);
    }

    public void checkSearchBox() {
        elementHelper.checkElement(searchBox);
    }

    public void sendKeysSearchBox(String text) {
        elementHelper.sendKeys(searchBox, text);
    }

    public void checkListBox() {
        elementHelper.checkElement(listBox);
    }

    public void clickListBoxButtons(String button) {
        elementHelper.clickListElement(listBoxButtons, button);
    }

}
