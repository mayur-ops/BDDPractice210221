package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuButtonSteps {

    HomePage homePage = new HomePage();

    @When("user do click on the menu button")
    public void user_do_click_on_the_menu_button() {
        homePage.menuButton();
    }

    @When("user click on the drink")
    public void user_click_on_the_drink() {
    homePage.menuDropDownLists();
    }

    @When("user click on the bigger pack")
    public void user_click_on_the_bigger_pack() {
    homePage.bulkDrinks();
    }

    @Then("user should able to see bigger pack related products")
    public void user_should_able_to_see_bigger_pack_related_products() {
    //homePage.bulkDrinksAssertion();
    }


}
