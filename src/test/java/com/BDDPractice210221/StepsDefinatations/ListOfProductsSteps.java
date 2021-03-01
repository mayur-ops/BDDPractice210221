package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.ResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListOfProductsSteps {

    ResultPage resultPage = new ResultPage();

    @Given("user is on the milk results page")
    public void user_is_on_the_milk_results_page() {
    resultPage.titleOfTheMilkResultPage();
    }


    @When("user select the semi-skimmed milk from the lists")
    public void user_select_the_semi_skimmed_milk_from_the_lists() {
    resultPage.listOfProducts();
    }


    @Then("user should be able to see individual milk product")
    public void user_should_be_able_to_see_individual_milk_product() {
    resultPage.selectedMilkProduct();
    }

}
