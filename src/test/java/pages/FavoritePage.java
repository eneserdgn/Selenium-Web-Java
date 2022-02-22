package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementUtil;

public class FavoritePage {

    private WebDriver driver;
    private ElementUtil elementUtil;

    // By Locators
    private By btnList_tabs = By.cssSelector(".nav.nav-tabs>li>a");
    private By txt_EmptyMessageOnTab = By.cssSelector("#favorites span");
    private By btn_Menu = By.id("user-info");
    private By btnList_MenuOptions = By.cssSelector(".ys-userSettings li a");
    private By txt_EmptyMessageOnFavoritePage = By.cssSelector("#favorites p");
    private By btn_ListRestaurant = By.cssSelector(".list-restaurant");
    private By btn_PopupClose = By.id("cboxClose");
    private By btn_Restaurants = By.cssSelector("#super-restaurants a>span");
    private By btn_AddFavorite = By.cssSelector(".ys-icons.ys-icons-grayStar");
    private By txt_RestaurantName = By.cssSelector(".restaurant-name b");
    private By txt_RestaurantNameParent = By.xpath("./../../../input");
    private By btn_Delete = By.cssSelector(".delete-favourites");


    // Constructor
    public FavoritePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtil = new ElementUtil(driver);
    }

    // Page Actions
    public void clickTab(String tab) {
        elementUtil.clickTextContains(btnList_tabs, tab);
    }

    public void checkEmptyMessageOnTab(String emptyMessage) {
        elementUtil.checkElementText(txt_EmptyMessageOnTab, emptyMessage);
    }

    public void clickMenu() {
        elementUtil.click(btn_Menu);
    }

    public void clickMenuOption(String menu) {
        elementUtil.clickTextContains(btnList_MenuOptions, menu);
    }

    public void checkEmptyMessageOnFavoritePage(String emptyMessage) {
        elementUtil.checkElementText(txt_EmptyMessageOnFavoritePage, emptyMessage);
    }

    public void clickListRestaurant() {
        elementUtil.click(btn_ListRestaurant);
    }

    public void clickPopupClose() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (driver.findElements(btn_PopupClose).size() != 0) {
            elementUtil.click(btn_PopupClose);
        }
    }


    public void clickRestaurant(String restaurant) {
        elementUtil.clickTextContains(btn_Restaurants, restaurant);
    }

    public void clickAddFavorite() {
        elementUtil.click(btn_AddFavorite);
    }


    public void checkRestaurantOnFavoritePage(String restaurant) {
        elementUtil.checkTextFromElements(txt_RestaurantName, restaurant);
    }

    public void clickCheckRestaurantOnFavoritePage(String restaurant) {
        elementUtil.clickTextContainsUnderElement(txt_RestaurantName,txt_RestaurantNameParent,restaurant);
    }

    public void clickDelete() {
        elementUtil.click(btn_Delete);
    }

}
