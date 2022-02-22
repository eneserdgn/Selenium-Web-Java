package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FavoritePage;
import util.DriverFactory;

public class FavoritePageSteps {

    private FavoritePage favoritePage = new FavoritePage(DriverFactory.getDriver());

    @When("user clicks {string} button on tabs")
    public void clickTab(String tab) {
        favoritePage.clickTab(tab);
    }

    @Then("user should see empty tab message {string} on tab")
    public void checkEmptyTabMessage(String message) {
        favoritePage.checkEmptyMessageOnTab(message);
    }

    @When("user clicks menu")
    public void clickMenu() {
        favoritePage.clickMenu();
    }

    @When("user clicks {string} button on menu")
    public void clickMenuOption(String menu) {
        favoritePage.clickMenuOption(menu);
    }

    @Then("user should see empty favorite message {string} on Favorite Page")
    public void emptyFavoriteMessage(String message) {
        favoritePage.checkEmptyMessageOnFavoritePage(message);
    }

    @When("user clicks list restaurants")
    public void clickRestaurant() {
        favoritePage.clickListRestaurant();
        favoritePage.clickPopupClose();
    }

    @When("user click {string} restaurant on Super Restaurant Tab")
    public void clickRestaurantOnTab(String restaurant) {
        favoritePage.clickRestaurant(restaurant);
    }

    @When("user click Add Favorite")
    public void clickAddFavorite() {
        favoritePage.clickAddFavorite();
    }

    @Then("user should see {string} restaurant on Favorite Page")
    public void checkRestaurant(String restaurant) {
        favoritePage.checkRestaurantOnFavoritePage(restaurant);
    }

    @When("user click check {string} restaurant on Favorite Page")
    public void clickRestaurantCheck(String restaurant) {
        favoritePage.clickCheckRestaurantOnFavoritePage(restaurant);
    }

    @When("user click delete button")
    public void clickDelete() {
        favoritePage.clickDelete();
    }

}

