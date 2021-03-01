package com.BDDPractice210221.StepsDefinatations;

import com.BDDPractice210221.PageObject.ResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrandNameProductSteps {

    ResultPage resultPage = new ResultPage();


    @When("user select the iceland brand products")
    public void user_select_the_iceland_brand_products() {
        resultPage.brandNameProduct();
    }


    @Then("use should able to see all iceland brand related products")
    public void use_should_able_to_see_all_iceland_brand_related_products() {
    resultPage.brandNameProductAssertion();
    }

}
