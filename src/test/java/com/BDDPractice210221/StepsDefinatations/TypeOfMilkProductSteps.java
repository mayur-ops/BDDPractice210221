package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.ResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TypeOfMilkProductSteps {

    ResultPage resultPage = new ResultPage();

    @When("user select the oat type of milk")
    public void user_select_the_oat_type_of_milk() {

    }


    @Then("user should be able to see oat type of milk related products")
    public void user_should_be_able_to_see_oat_type_of_milk_related_products() {
    resultPage.typeOfMilkProductAssertion();
    }

}
