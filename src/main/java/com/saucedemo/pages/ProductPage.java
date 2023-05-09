package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

//    By productsText = By.className("title");
    By actualNoOfProducts = By.xpath("//div[@class='inventory_item_name']");

    @CacheLookup
    @FindBy(className = "title")
    WebElement productsText;

//    @CacheLookup
//    @FindBy(xpath = "//div[@class='inventory_item_name']")
//    WebElement actualNoOfProducts;

    public String getProductText(){
        return getTextFromElement(productsText);
    }
    public boolean numberOfProducts(int expectedNoOfProducts){
        return getNumberFromElement(actualNoOfProducts,expectedNoOfProducts);
    }

}
