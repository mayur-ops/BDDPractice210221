package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoDropDownOptionsSteps {

    HomePage homePage = new HomePage();

    @When("user type milk in the search box auto drop down options appear")
    public void user_type_milk_in_the_search_box_auto_drop_down_options_appear() {
    homePage.doSearch("milk");
    }

    @When("user do select one of the auto drop down options product")
    public void user_do_select_one_of_the_auto_drop_down_options_product() {
    homePage.dropDownList();
    }

    @Then("user should be able to see related product")
    public void user_should_be_able_to_see_related_product() {
    homePage.dropDownProductAssertion();
    }

}
