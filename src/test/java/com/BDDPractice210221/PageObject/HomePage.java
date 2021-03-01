package com.BDDPractice210221.PageObject;

import com.BDDPractice210221.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends DriverFactory {

    @FindBy(id = "header-search")
    WebElement searchBox;

    public void doSearch(String item) {
        searchBox.sendKeys(item);
    }

    public void clickSearchBox() {
        searchBox.sendKeys(Keys.ENTER);
    }

    public void getCurrentUrlAssertion() {
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertThat(actualUrl, Matchers.containsString("https://www.iceland.co.uk/"));
    }

    public void getTitleAssertion() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertThat(actualTitle, Matchers.containsString("Milk | Milk, Butter and Eggs | Iceland Foods"));
    }


    @FindBy(css = ".product-suggestion ")
    List<WebElement> dropDoenLists;

    @FindBy(xpath = "//*[@id=\"pdpMain\"]/div[1]/div[1]/div[3]/div[1]/h2")
    WebElement selectedProduct;

    public void dropDownList() {
        for (WebElement dropDownList : dropDoenLists) {
            System.out.println(dropDownList.getText());
            if (dropDownList.getText().contains("Iceland British Fresh Pasteurised Semi Skimmed Milk 6 Pints")) {
                dropDownList.click();
                break;
            }
        }
    }

    public void dropDownProductAssertion() {
        String actualProduct = selectedProduct.getText();
        Assert.assertThat(actualProduct, Matchers.containsString("Iceland British Fresh Pasteurised Semi Skimmed Milk 6 Pints"));
    }

    @FindBy(xpath = "//*[@id=\"navigation\"]/div/div/div/ul/li/a")
    WebElement menuButton;

    @FindBy(css = ".menu-category-item.expandable-menu-wrapper")
    List<WebElement> menuDropDownLists;

    @FindBy(css = ".expandable-menu-wrapper")
    List<WebElement> bulkDrinks;


    public void menuButton() {
        menuButton.click();
    }

    public void menuDropDownLists() {
        for (WebElement menuDropDownList : menuDropDownLists) {
            System.out.println(menuDropDownList.getText());
            if (menuDropDownList.getText().contains("Drinks")) {
                menuDropDownList.click();
                break;
            }
        }
    }

    public void bulkDrinks(){
    for (WebElement bulkDrink: menuDropDownLists){
        System.out.println(bulkDrink.getText());
        if (bulkDrink.getText().contains("Bigger Packs")){
           bulkDrink.click();
           break;
            }
        }
    }

    public void bulkDrinksAssertion(){

    }
}

