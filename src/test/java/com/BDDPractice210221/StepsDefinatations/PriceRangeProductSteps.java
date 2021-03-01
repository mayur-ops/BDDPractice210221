package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.ResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceRangeProductSteps {

    ResultPage resultPage = new ResultPage();

    @When("user select the one pound and two pound range products")
    public void user_select_the_one_pound_and_two_pound_range_products() {
        resultPage.priceRangeProducts();
    }

    @Then("user should able to see related price range products")
    public void user_should_able_to_see_related_price_range_products() {
    resultPage.priceRangeProductsAssertions();
    }

}
