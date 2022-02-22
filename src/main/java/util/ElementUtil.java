package util;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementUtil {

    private WebDriver driver;
    private Actions action;
    private WebDriverWait wait;
    JavascriptExecutor js;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, 5);
        this.js = (JavascriptExecutor) driver;
    }

    /**
     * @param element
     */
    public void click(By element) {
        findElement(element).click();
    }

    /**
     * @param element
     * @param text
     */
    public void clickTextContains(By element, String text) {
        boolean check = false;
        List<WebElement> elements = findElements(element);
        for (WebElement elem : elements) {
            if (elem.getText().contains(text)) {
                elem.click();
                scrollToElement(elem);
                check = true;
                break;
            }
        }
        if (check == false) {
            Assert.fail("İstediğin textte element bulamadı");
        }
    }

    /**
     *
     * @param element
     * @param under
     * @param text
     */
    public void clickTextContainsUnderElement(By element,By under, String text) {
        boolean check = false;
        List<WebElement> elements = findElements(element);
        for (WebElement elem : elements) {
            if (elem.getText().contains(text)) {
                WebElement elem2 = elem.findElement(under);
                elem2.click();
                scrollToElement(elem2);
                check = true;
                break;
            }
        }
        if (check == false) {
            Assert.fail("İstediğin textte element bulamadı");
        }
    }

    /**
     * @param element
     * @param text
     */
    public void sendKey(By element, String text) {
        if (text.contains("@")) {
            String[] array = text.split("@");
            findElement(element).sendKeys(array[0]);
            action.keyDown(Keys.ALT).sendKeys("q").keyUp(Keys.ALT).perform();
            findElement(element).sendKeys(array[1]);
        } else {
            findElement(element).sendKeys(text);
        }
    }

    /**
     * @param element
     * @return
     */
    public String getText(By element) {
        return findElement(element).getText();
    }

    /**
     * @param element
     * @param text
     */
    public void checkElementText(By element, String text) {
        wait.until(ExpectedConditions.textToBe(element, text));
    }

    public void checkTextFromElements(By element, String text) {
        boolean check = false;
        List<WebElement> elements = findElements(element);
        for (WebElement elem : elements) {
            if (elem.getText().contains(text)) {
                check = true;
                scrollToElement(elem);
                break;
            }
        }
        if (check == false) {
            Assert.fail("İstediğin textte element bulamadı");
        }
    }

    /**
     * @param element
     * @return
     */
    public String getAttribute(By element) {
        return findElement(element).getText();
    }

    /**
     * @param element
     * @param attr
     * @param text
     */
    public void setAttribute(By element, String attr, String text) {
        WebElement elem = findElement(element);
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2])", elem, attr, text);
    }

    /**
     * @return
     */
    public String getTitle() {
        return driver.getTitle();
    }

    /**
     * @param element
     * @return
     */
    public WebElement findElement(By element) {
        return waitVisibility(element);
    }

    /**
     * @param element
     * @return
     */
    public List<WebElement> findElements(By element) {
        return waitVisibilities(element);
    }

    /**
     * @param element
     * @return
     */
    public WebElement waitVisibility(By element) {
        WebElement elem = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        scrollToElement(elem);
        return elem;
    }

    /**
     * @param element
     * @return
     */
    public List<WebElement> waitVisibilities(By element) {
        List<WebElement> elem = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        scrollToElement(elem.get(0));
        return elem;
    }

    /**
     * @param element
     */
    public void scrollToElement(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
    }
}
