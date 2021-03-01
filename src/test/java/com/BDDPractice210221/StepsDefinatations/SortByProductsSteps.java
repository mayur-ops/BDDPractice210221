package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.ResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortByProductsSteps {

    ResultPage resultPage = new ResultPage();

    @When("user select the bestsellers dropdown options")
    public void user_select_the_bestsellers_dropdown_options() {
    resultPage.bestSellers();
    }


    @Then("user should able to see bestsellers option related product")
    public void user_should_able_to_see_bestsellers_option_related_product() {
    resultPage.bestSellersAssertion();
    }

}
