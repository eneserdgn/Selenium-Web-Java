package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultPage {

    ElementHelper elementHelper;

    By resultsList = By.id("tvcap");


    public ResultPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkResults() {
        elementHelper.checkElement(resultsList);
    }

}
