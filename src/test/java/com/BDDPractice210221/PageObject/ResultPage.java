package com.BDDPractice210221.PageObject;

import com.BDDPractice210221.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ResultPage extends DriverFactory {

    @FindBy(css = ".product-name")
    List<WebElement>  listOfMilkProducts;

    @FindBy(xpath = "//*[@id=\"pdpMain\"]/div[1]/div[1]/div[3]/div[1]/h2")
    WebElement MilkProduct;

    public void listOfProducts (){
        for (WebElement listOfMilkProduct: listOfMilkProducts){
            System.out.println(listOfMilkProduct.getText());
            if (listOfMilkProduct.getText().contains("Dale Farm Fresh Semi-Skimmed Milk 1 Pint/ 568ml")){
              listOfMilkProduct.click();
              break;
            }
        }
    }

    public void titleOfTheMilkResultPage(){
    String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
    }

    public void selectedMilkProduct(){
        String actualMilkProduct =  MilkProduct.getText();
        Assert.assertThat(actualMilkProduct, Matchers.containsString("Dale Farm Fresh Semi-Skimmed Milk 1 Pint/ 568ml"));
    }

    @FindBy(id = "grid-sort-header")
    WebElement sortByLists;

    public void bestSellers(){
        Select sel = new Select(sortByLists);
        sel.selectByIndex(2);

        List<WebElement> options = sel.getAllSelectedOptions();
        for (WebElement option: options){
            System.out.println(option.getText());
        }
    }

    public void bestSellersAssertion(){
        String selectedTitle = sortByLists.getText();
        System.out.println(selectedTitle);
        Assert.assertThat(selectedTitle,Matchers.containsString("Price: High to Low"));
    }


    @FindBy(css = ".refinement-link")
    List<WebElement> priceRanges;

    @FindBy(id = "-0000000001")
    WebElement priceRangeCheckBox;

    public void priceRangeProducts(){
       for(WebElement priceRange: priceRanges){
           System.out.println(priceRange.getAttribute("id"));
           if (priceRange.getAttribute("id").contains("-0000000001")){
               priceRange.click();
               break;
           }
       }
    }

    public void priceRangeProductsAssertions(){
       String selectedPriceCheckBox = priceRangeCheckBox.getAttribute("title");
       Assert.assertThat(selectedPriceCheckBox, Matchers.containsString("Refine by Price: £1.00 - £2.00"));
    }

    @FindBy(css = ".refinement-link")
    List<WebElement> brandNames;

    @FindBy(xpath = "//*[@id=\"brand-iceland\"]")
    WebElement icelandBrandCheckBox;

    public void brandNameProduct(){
        for (WebElement brandName: brandNames){
            System.out.println(brandName.getAttribute("id"));
            if (brandName.getAttribute("id").contains("brand-iceland")){
                brandName.click();
                break;
            }
        }
    }

    public void brandNameProductAssertion(){
      String icelandProducts = icelandBrandCheckBox.getAttribute("id");
      Assert.assertThat(icelandProducts, Matchers.containsString("brand-iceland"));
    }

    @FindBy(css = ".refinement-link")
    List<WebElement>  milkTypes;

    @FindBy(xpath = "//*[@id=\"filterType-oat_milk\"]")
    WebElement oatMilkType;

    public void typeOfMilkProducts(){
    for (WebElement milkType: milkTypes){
        System.out.println(milkType.getAttribute("id"));
        if (milkType.getAttribute("id").contains("filterType-oat_milk")){
            milkType.click();
            break;
        }
    }
    }

    public void typeOfMilkProductAssertion(){
        String oatMilkCheckBox = oatMilkType.getAttribute("id");
        Assert.assertThat(oatMilkCheckBox, Matchers.containsString("filterType-oat_milk"));
    }

}
