package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IndividualSearchProductSteps {

   HomePage homePage = new HomePage();

    @Given("user is on home page of iceland website")
    public void user_is_on_home_page_of_iceland_website() {
        homePage.getCurrentUrlAssertion();
    }

    @When("user type milk in the search box")
    public void user_type_milk_in_the_search_box() {
        homePage.doSearch("milk");
    }

    @When("user click on the search box button")
    public void user_click_on_the_search_box_button() {
        homePage.clickSearchBox();
    }

    @Then("user should be able to see related milk products")
    public void user_should_be_able_to_see_related_milk_products() {
        homePage.getTitleAssertion();
    }

}
